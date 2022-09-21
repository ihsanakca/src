package Day_32_Constructor;

public class Square {
   public int sideLenght;

   public Square(){

   }

   public Square(int sideLenght){
this.sideLenght=sideLenght;
   }

   public int calculateArea(){
     return (int) Math.pow(this.sideLenght,2);
   }
   public static double calculateArea(int sideLenght){
      return Math.pow(sideLenght,2);
   }
   public int calculatePerimeter(){
      return this.sideLenght*4;
   }
   public static int calculatePerimeter (int sideLenght){
       return sideLenght*4;

   }
}
