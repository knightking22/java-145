import java.util.*;
//Print Inverted Star Pattern
public class InvertedStarPattern {
    int n= 4;
    public static void main(String args[]) {
        for(int line=1; line<=4; line++) {
            for(int star=1; star<=4-line+1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
