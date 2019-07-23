
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaLoop1 {



  //  private static final Scanner scanner = new Scanner(System.in);

 public static void main(String[] args) {
//      System.out.println( " ############ " );
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();


//      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
// scanner.nextLine();
         s.close();

//System.out.println( n);

int i=1;
for(i=1; i< 11; i++)
{
        System.out.println( n + " x " + i + " = " + n*i );
}

    }
//System.out.println( " ######################## " );
//System.out.println("-----");

}





=======================================================================


import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        s.close();

        System.out.println("Int:" + a);



    }
}
