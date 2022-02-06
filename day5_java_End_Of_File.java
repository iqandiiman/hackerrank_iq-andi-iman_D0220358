import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day5_java_End_Of_File {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 1;
        while (scan.hasNext()) {// Deteksi EOF
            String s = scan.nextLine();
            System.out.println(k + " " + s);
            k++;
        }
    }
}
