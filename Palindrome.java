public class Palindrome {
    public static void main(String args[]) {
        int num =121 ,reversednum = 0,reminder, originalnum;
        originalnum = num;
        while( num !=0) {
            reminder = num %10;
            //System.out.println(reminder);
            reversednum = reversednum *10 +reminder;
            //System.out.println(reversednum);
            num /=10;
            //System.out.println(num);
        }
    if(originalnum == reversednum) 
        System.out.println(originalnum + " is a palindrome");
    else 
        System.out.println(originalnum + " is not palindrome");
    
    }
}


public class Palindrome {
    public static void main(String arg[]) {
        int num=11221,reversednum = 0,reminder,originalnum;
        originalnum = num;
        for(;num!=0;num/=10){
            reminder = num%10;
            reversednum = reversednum *10+reminder;
        }
        if(originalnum == reversednum) 
            System.out.println(originalnum + " is a palindrome");
        else 
            System.out.println(originalnum + " is not palindrome");
    }
}
