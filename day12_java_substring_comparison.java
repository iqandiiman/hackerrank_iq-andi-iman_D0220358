import java.util.Scanner;

public class day12_java_substring_comparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        int index = s.length()-k;
        
        for (int i=0; i<=index;i++) {
            String x = s.substring(i, i+k);
            
            if (smallest.compareTo(x)>0) {
                smallest = x;
            }
            
            if (largest.compareTo(x)<0) {
                largest = x;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
