//Print the elements of an array in the decreasing frequency if 2
// numbers have same frequency then print the one which came first.

package collectionboot;
import java.util.*;
public class ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedHashMap<Integer,Integer> ts=new LinkedHashMap<>();
        int a[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            ts.put(a[i],0);
        }

        for(int i=0;i<n;i++){
            if(ts.containsKey(a[i])){
                ts.put(a[i],ts.get(a[i])+1);
            }
        }

        Set<Map.Entry<Integer,Integer>> set=ts.entrySet();
        LinkedList<Map.Entry<Integer,Integer>> al=new LinkedList<>(set);
        Collections.sort(al, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue()>o2.getValue())
                    return -1;
                else if(o1.getValue()<o2.getValue())
                    return 1;
                else return 0;

            }
        });

        for(Map.Entry<Integer,Integer> m: al){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }

}
