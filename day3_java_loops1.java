import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class day3_java_loops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result); // -> cara pertama
            // System.out.printf("%d x %d = %d%n", N,i,result); ->cara kedua
            // int i = 1;
            // while(i<=10){
            //     int result = N * i;
            //     System.out.printf("%d x %d = %d%n", N,i,result);
            //     i++;
            // } -> cara ketiga
        }

        bufferedReader.close();
    }
}
