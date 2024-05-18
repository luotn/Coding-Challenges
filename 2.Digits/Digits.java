import java.util.*;

public class Digits {
    public static void main(String[] args) {
        int min = 9;
        int max = 19;
        System.out.println(countNoDup(min, max));
    }

    public static int countNoDup(int min, int max)
    {
        int result = 0;
        for(int i = min; i <= max; i++)
        {
            if(!haveDup(i))
                result++;
        }
        return result;
    }

    public static boolean haveDup(int n)
    {
        if(n < 10)
            return false;
        // Using hashset due to its nature of disallowing
        // repeating keys.
        Set<Integer> dups = new HashSet<Integer>();
        while(n > 0)
        {
            if(!dups.add(n % 10))
                return true;
            n /= 10;
        }
        return false;
    }
}
