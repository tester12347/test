public class Animal implements Mammal {
   public String eat(){
      return "Animal eats";
   }
   public String travel(){
      return "Animal travels";
   } 
   public int noOfLegs(){
      return 0;
   }
   public static void main(String args[]){
      Animal animal = new Animal();

   }
}
//test
