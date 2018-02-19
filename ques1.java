//Write Java code to define List . Insert 5 floating point numbers in List,
// and using an iterator, find the sum of the numbers in List.

package collectionboot;
import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List <Float> li=new ArrayList<>();
        for(int i=0;i<5;i++)
             li.add(sc.nextFloat());
        ListIterator<Float> it=li.listIterator();
        System.out.println("Sum of elements are: ");
        float s=0;
        while(it.hasNext())
            s=s+it.next();
        System.out.println(s);

    }

}