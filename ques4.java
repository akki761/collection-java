//Write a program to sort Employee objects based on highest
// salary using Comparator. Employee class{ Double Age; Double Salary; String Name

package collectionboot;
import java.util.*;

class employee {
    String name;
    double salary;
    double age;
    employee(String name, double salary, double age){
        this.name = name;
        this.salary = salary;
        this.age=age;
    }
}

 class salarycomp implements Comparator<employee>{

    public int compare(employee e1,employee e2){
        if(e1.salary<e2.salary)
            return 1;
        else if(e1.salary==e2.salary)
            return 0;
        else
            return -1;

    }
}

public class ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of employee");
        int n=sc.nextInt();
        System.out.println("Enter employee info");
        String name;
        double salary,age;

        ArrayList<employee> al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            System.out.println("Enter name");
              name=sc.next();
            System.out.println("Enter sal");
              salary=sc.nextDouble();
            System.out.println("Enter age");
              age=sc.nextDouble();
              al.add(new employee(name,salary,age));
        }

        Collections.sort(al,new salarycomp());
        for(employee e: al)
            System.out.println("Employee info is: "+ e.name+" salary "+e.salary+" age "+ e.age);

    }
}

