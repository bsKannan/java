//Fibonacci series 

public class Fibonacci {
    
    public static void main(String args[]) {
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.print("First " + n + " terms: ");
        
        for(int i = 1; i<=n; i++) {
            System.out.print(a +" + ");
            int sum = a+b;
            a = b;
            b= sum;
        }
    }
}


//another way
public class Fibonacci {
    public static void main(String arg[]) {
        int n = 10;
        int i = 1;
        int a = 0;
        int b = 1;
         System.out.print("First " + n + " terms: ");
         
         while( i<=n) {
          System.out.print(a +" + ");
          int sum = a+b;
          a = b ;
          b = sum;
          i++;
         }
    }
}




//upto number 100

public class Fibonacci {

    public static void main(String[] args) {

        int n = 100, t1 = 0, t2 = 1;
        
        System.out.print("Upto " + n + ": ");
        while (t1 <= n)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
