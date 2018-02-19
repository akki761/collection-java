//Write a program to sort the Student objects based on Score , if the score are same then sort on
//        First Name . Class Student{ String Name; Double Score; Double Age

package collectionboot;
import java.util.*;

class students {
    String name;
    double score, age;

    students(String name, double score, double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }
}
public class ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int n=sc.nextInt();

        List<students> li=new ArrayList<>();
        System.out.println("Enter info");
        for(int i=0;i<n;i++){
            String name=sc.next();
            double score=sc.nextDouble();
            double age=sc.nextDouble();
            li.add(new students(name,score,age));
        }

        Collections.sort(li, new Comparator<students>() {
            @Override
            public int compare(students stu, students t1) {
                if(stu.score>t1.score)
                    return 1;
                else if(stu.score<t1.score)
                    return -1;
                else{
                    if((stu.name).compareTo(t1.name)>0)
                        return 1;
                    else if((t1.name).compareTo(stu.name)>0)
                        return -1;
                    else return 0;
                }
            }
        });

        for(students e: li)
            System.out.println("Student info is: "+ e.name+" salary "+e.score+" age "+ e.age);

    }
}
