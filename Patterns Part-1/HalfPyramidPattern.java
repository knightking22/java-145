import java.util.*;
//Print Half Pyramid Pattern
public class HalfPyramidPattern {
    public static void main(String args[]) {
      int n = 4;
      for(int line=1; line<=4; line++) {
        // numbers print 
        for(int number=1; number<=line; number++) {
            System.out.print(number);
        }
        System.out.println();
      }
        
    }
    
}
