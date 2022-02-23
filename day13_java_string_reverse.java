import java.io.*;
import java.util.*;

public class day13_java_string_reverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrome = false;
        StringBuilder sb = new StringBuilder(A);
        String bk = sb.reverse().toString();
        System.out.println(A.equals(bk)?"Yes":"No");
    }
}