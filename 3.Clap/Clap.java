public class Clap {
    public static void main(String[] args) {
        int min = -14;
        int max = 49;
        // System.out.println(countClaps(min, max));
        System.out.println(clap(min, max));
    }

    public static int countClaps(int min, int max)
    {
        String claps = clap(min, max);
        int result = 0;

        while(claps.indexOf("Clap! ") != -1)
        {
            result++;
            claps = claps.substring(claps.indexOf("Clap! ") + 6);
        }
        return result;
    }

    public static String clap(int min, int max)
    {
        String result = "";

        for(int i = min; i <= max; i++)
        {
            if(i % 7 == 0)
            {
                result += "Clap! ";
                continue;
            }
            int j = i;
            boolean clapped = false;
            while(j > 0)
            {
                if(j % 10 == 7)
                {
                    result += "Clap! ";
                    clapped = true;
                    break;
                }
                j /= 10;
            }
            result += clapped ? "" : i + " ";
        }
        return result;
    }
}
