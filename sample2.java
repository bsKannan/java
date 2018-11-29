public class QuotientRemainder {
    public static void main(String[] args) {
        int dividend = 25, divisor = 4;
        
        int quotient = dividend / divisor;
        int reminder = dividend % divisor;
        
        System.out.println("Quotient " + quotient);
        System.out.println("Reminder " + reminder);
    }
}

// swapping two numbers
public class Swap {
    public static void main(String[] args) {
        float a = 1.2f, b = 2.4f;
        
        System.out.println("Before Swapping");
        System.out.println("First number " + a);
        System.out.println("Second number " + b);
        
        float temp  = a;
        a = b;
        b = temp;
        
        System.out.println("After Swapping");
        System.out.println("First number " + a);
        System.out.println("Second number " + b);
    }
}

// vowels
public class Swap {
    public static void main(String args[]) {
        int a = 10, b = 20;
        System.out.println("Before Swapping");
        System.out.println("First number " + a);
        System.out.println("Second number " + b);
        
        a = a-b;
        b = a+b;
        a = b-a;
        System.out.println("After Swapping");
        System.out.println("First number " + a);
        System.out.println("Second number " + b);
    }
}



    public static void main(String args[]) {
        char ch = 'b';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch + " Is Vowel");
        else 
            System.out.println(ch + " Is not Vowel");
    }
}

public class VowelConsonent {
    public static void main(String args[]) {
        char ch = 'a';
        
        
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is Vowel");
                break;
            default:
                System.out.println(ch + " is not Vowel");
        }
    }
}



ax2 + bx + c = 0, where
a, b and c are real numbers and
a ≠ 0



