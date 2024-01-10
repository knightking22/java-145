import java.util.*;

public class Calsulator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.err.println("enter b :");
        int b = sc.nextInt();
        System.out.println();
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("MY CALCULATOR IS NOT THAT ADVANCED");
        }
        
    }
    
}
