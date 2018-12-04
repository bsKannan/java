import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        
        double a = reader.nextDouble();
        double b = reader.nextDouble();
        
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);
        
        double result;
        
        switch(operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", a, operator, b, result);
    }
    
}
