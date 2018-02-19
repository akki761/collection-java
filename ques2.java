//Write a method that takes a string and returns the number of unique characters in the string.
package collectionboot;
import java.util.*;
public class ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        ques2 ob=new ques2();
        int r=ob.unique(s);
        System.out.println("Number of unique character in a string are: "+r);
    }

    public int unique(String s){
        int l=s.length();
        HashSet<Character> ha=new HashSet<>();
        for(int i=0;i<l;i++){
            ha.add(s.charAt(i));
        }

        return ha.size();
    }
}
