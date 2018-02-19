//Write a program to format date as example "21-March-2016"

package collectionboot;
import java.text.SimpleDateFormat;
import java.util.*;

public class ques8 {
    public static void main(String[] args) {
        Date d=new Date();
        SimpleDateFormat dt=new SimpleDateFormat("dd-MMMMM-yyyy");
        System.out.println("Date is: "+ (dt.format(d)).toString());
    }
}
