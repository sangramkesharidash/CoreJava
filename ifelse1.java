Task 
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.


====================================================================================
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ifelse1 {

    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


                if (a % 2 != 0)
                        System.out.println("Weird");
            if (a % 2 == 0)
                {
                        if (a >=2 && a <= 5)
                                System.out.println("Not Weird");
                        else if (a >=6 && a <= 20)
                                System.out.println("Weird");
                        else if (a > 20)
                                System.out.println("Not Weird");

                }
                else
                        System.out.println("...LOL.....");
}

}



