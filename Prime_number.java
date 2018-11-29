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
