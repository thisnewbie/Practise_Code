import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        String parts[] = s.split("AM");
        if(parts[1]=="AM")
        {
            return parts[0];
            
        }
        else{
            String [] numbers = parts[0].split(":");
            numbers[0]="1";
            int something =Integer.parseInt(numbers[0]);
            something = something+12;    
            numbers[0] = Integer.toString(something);
            something =Integer.parseInt(numbers[1]);
            something = something+12;    
            numbers[1] = Integer.toString(something);
            System.out.println(numbers[1]);
            String sa= numbers[0]+":"+numbers[1]+":"+numbers[2];
            return sa;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
