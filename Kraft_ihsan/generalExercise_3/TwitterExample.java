package generalExercise_3;

import java.util.*;

public class TwitterExample {
    public static void main(String[] args) {
        int[] nums = {1,22,77,5,94};
//        System.out.println(containsDuplicate(nums));

//        System.out.println(isAnagram("d", "d"));

//        System.out.println(Arrays.toString(twoSum(nums, 82)));

        String [] strs = {"eat","tea","tan","ate","nat"};
//        System.out.println(groupAnagrams(strs));
        System.out.println(anagramGroup(strs));

    }

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        int count = 0;

        while (!s.isEmpty()) {
            String control = s.substring(0, 1);
            if (t.contains(control)) {
                count++;

            }
            s = s.substring(1);
        }
        return count == t.length();
    }

    public static int [] twoSum(int [] arr, int target){
        int result []=new int[2];
        for (int i=0; i<arr.length; i++){
            for (int j=i+1;j<arr.length; j++){
                if (arr[i]+arr[j]==target){
                    result[0]=i;
                    result[1]=j;
                   return result;
                }

            }
        }
return result;
    }

    // all anagrams in the same group would have the same frequency for each character
    // e.g. ["nat","tan"] - both have 1 'a', 1't', and 1'n'
    // in other words, we can group the anagrams by their frequencies
    // another observation is that after sorting all anagrams in the group,
    // they would have the same result (because they have same frequency of each word)
    // ["nat","tan"] -> "ant"
    // so we can also group the anagrams by its sorted key
    // below it the group by sorted key version
    public static List<List<String>> groupAnagrams(String[] strs) {
        // we need to a hashmap to store an array of the anagrams
        // with its sorted string as the key
        // e.g. "ant":  ["nat","tan"]
        Map<String, List<String>> m = new HashMap<>();
        // iterate each string
        for (String s : strs) {
            // since we need to know the original value,
            // we copy `x` to `t` for sorting
            char[] charArr = s.toCharArray();
            // sort it to make the key
            Arrays.sort(charArr);
            String t = new String(charArr);
            // push the orginal the value under its sorted key
            if (!m.containsKey(t)) {
                m.put(t, new ArrayList());
            }
            m.get(t).add(s);
        }
        // build the final anwser
        return  new ArrayList(m.values());
    }

    public static List<String> anagramGroup(String [] strs){
        Map<String,List<String>>map=new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String t=new String(chars);

            if (!map.containsKey(t)){
                map.put(t,new ArrayList<>());
            }
            map.get(t).add(s);

        }

        return new ArrayList(map.values());
    }
}
