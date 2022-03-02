import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger b = new BigInteger(n);
        boolean prima = b.isProbablePrime(1);
        
        System.out.println(prima ? "prime" : "not prime");

        bufferedReader.close();
    }
}