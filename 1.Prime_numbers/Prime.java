import java.util.*;

public class Prime{

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int min = 0;
        int max = 100;

        System.out.println(checkPrime(min, max));
        
        long endTime = System.nanoTime();
        System.out.println("This run took: " + (endTime - startTime) + " nano seconds.");
    }

    public static List<Integer> checkPrime(int min, int max)
    {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = min; i <= max; i++) {
            if(check(i) == true)
            {
                result.add(i);
            }
        }
        return result;
    }

    static boolean check(int i) {
        if(i <= 1)
            return false;

        boolean result = true;

        // Sqrt is due to the fact that we do not 
        // have to check larger than the sqrt of 
        // the given value to find all non-prime 
        // number components.
        for(int j = 2; j <= Math.sqrt(i); j++) {
        // for(int j = 2; j < i; j++) {     #origional
            if (i % j == 0)
            {
                result = false;
                break;
            }
        }

        return result;
    }
}