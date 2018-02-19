//Write a program to display times in different country format.
package collectionboot;
import java.text.DateFormat;
import java.util.*;


public class ques9 {

    public static void main(String[] args)  {
        Date d1= new Date();
        Date d2= new Date();
        Date d3 = new Date();

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,Locale.CHINESE);
        System.out.println("china: "+ df.format(d1));
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,Locale.GERMAN);
        System.out.println( "german: "+df1.format(d2));
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,Locale.FRANCE);
        System.out.println( "france: "+df2.format(d3));
    }
}