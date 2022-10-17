package bootCamp.OOP;

public class B10_Encapsulation {

    //encapsulation : data hiding / private accsess modifier
    //use getter and setter methods
    //getter : read only---return the private data, parametre yok...
    //setter  :write only---no return- parametre var..


    private String rank="quarter";
    private int score=10;

    public String getRank(){
        return rank;
    }
    public void setRank(String newRank){
        rank=newRank;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        score = newScore;
    }
}
class mainB10{
    public static void main(String[] args) {

        B10_Encapsulation soldier=new B10_Encapsulation();

        boolean hit=true;

        int score = soldier.getScore();

            soldier.setScore(score+=10);
            soldier.setRank("upperQuarter");

        System.out.println("soldier.getScore() = " + soldier.getScore());
        System.out.println("soldier.getRank() = " + soldier.getRank());
    }
}
