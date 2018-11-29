import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter Your number: ");
        
        int number = a.nextInt();
        
        System.out.println("Your entered: " + number);
    }
}






import java.util.Scanner;


import java.io.*;
public class Addinegers {
    public static void main(String[] args) {
        // int a =10,b = 20;
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = a + b;
        
        System.out.println("Sum is " + sum);
    }
}


import java.io.*;
public class Mulfloat {
    public static void main(String[] args) {
        
        float a = 1.2f;
        float b = 2.0f;
        float mul = a * b;
        
        System.out.println("Sum is " + mul);
    }
}




import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        /* This reads the input provided by user
         * using keyboard
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");

        // This method reads the number provided using keyboard
        double num1 = scan.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();

        // Closing Scanner after the use
        scan.close();
        
        // Calculating product of two numbers
        double product = num1*num2;
        
        // Displaying the multiplication result
        System.out.println("Output: "+product);
    }
}
