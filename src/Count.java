
import java.util.Arrays;

public class Count {
    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public static void main(String[] args)
    {
        String inputString1 = "edsab";
        String outputString1 = sortString(inputString1);
        System.out.println( "Input String: "+ inputString1);
        System.out.println("Output String: " + outputString1);

        String inputString2 = "geeksforgeeks";
        String outputString2 = sortString(inputString2);

        System.out.println("Input String : " + inputString2);

        System.out.println("Output String : "
                + outputString2);

    }
}
