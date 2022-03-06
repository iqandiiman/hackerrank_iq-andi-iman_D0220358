import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            al.add(ele);
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String query = sc.next();
            if (query.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                al.add(x, y);
            } else {
                int x = sc.nextInt();
                al.remove(x);
            }
        }
        Iterator i = al.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        sc.close();

    }
}