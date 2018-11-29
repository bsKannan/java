public class Pattern {
    public static void main(String args[])
    {
        int rows = 5;
        for(int i=1;i<=rows;i++) {
            for(int j=1;j<=i;j++) {
                //System.out.print("* ");//for star
                System.out.print(j+" ");//for number
            }
            System.out.println();
        }
    }
}

public class Pattern {
    public static void main(String args[]) {
        char last = 'E', alphabet = 'A';
        
        for(int i=1;i<=(last-'A'+1);++i) {
            for(int j=0;j<=i;++j) {
                System.out.print(alphabet + " ");//'' -is asccii value,""- is alphabet
            }
            ++alphabet;
            
            System.out.println();
        }
    }
}

public class Pattern {
    public static void main(String args[]) {
        int rows = 5;
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++) {
                // System.out.print("* ");//this is *
                System.out.print(j+ " ");//this is num
            }
            System.out.println();
        }
    }
}



public class Pattern {
    public static void main(String[] args) {
        int rows = 5,k=0;
        for(int i=1; i<= rows;++i, k=0) {
            for(int space =1;space <= rows-i;++space) {
               // System.out.print("   ");   
               System.out.print("  ");
            }
            while(k!=2 * i-1) {
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }
}
