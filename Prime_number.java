//Prime Num or not

public class Prime {
    public static void main(String args[]) {
        int num = 121;
        boolean a = false;
        
        for(int i=2; i<=num/2;i++) {
            //condition for notprime
            if(num %i == 0) {
                a = true;
                break;
            }
        }
        if(!a) {
            System.out.println(num + " is prime number");
        }else {
            System.out.println(num + " is not prime number");
        }
    }
}

//another wave
public class Prime {

    public static void main(String[] args) {

        int num = 33, i = 2;
        boolean flag = false;
        while(i <= num/2)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}


//Between Two intervals

public class Prime {
    public static void main(String args[]) {
    int low =20,high = 50;
    
    while (low < high) {
        boolean flag = false;
        
        for(int i = 2;i <= low/2;++i) {
            if(low % i == 0) {
                flag = true;
                break;
            }
        }
            if(!flag)
                System.out.print(low + "  ");
                ++low;
        
    }
    }
}
