//Write a method that takes a string and print
// the number of occurrence of each character characters in the string.
package collectionboot;
import java.util.*;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        ques3 ob=new ques3();
        ob.freq(s);
    }

    public void freq(String s){
        int l=s.length();
        HashMap<Character,Integer> ha=new HashMap<>();
        for(int i=0;i<l;i++) {

           if (ha.containsKey(s.charAt(i))) {
                ha.put(s.charAt(i), ha.get(s.charAt(i)) + 1);
           }
           else
               ha.put(s.charAt(i), 1);

        }
        for(Character ch: ha.keySet())
            System.out.println(ch+" has occurred "+ ha.get(ch)+" times");

    }
}
