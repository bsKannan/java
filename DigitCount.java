 public class Digit {
     public static void main(String[] args) {
         int num = 143,count = 0;
        
         while(num != 0) {
             num /=10;
             ++count;
         }
         System.out.println("Number of Digits " + count);
     }
 }

//for loop
public class Digit {
   public static void main(String[] args) {
       int count = 0, num = 147;
       
       for(;num !=0;num/=10, ++count) {
          
       }
        System.out.println("Number of Digits " + count);
   }
}
