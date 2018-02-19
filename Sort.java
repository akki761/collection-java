//sort emplpyee details acc. to salary,if salary is same then acc to age and lastly by name.

import java.util.*;
public class Sort {
private String name;
private int sal;
private int age;

        Sort(String name,int sal,int age){
        this.name=name;
        this.sal=sal;
        this.age=age;
        }

        @java.lang.Override
        public java.lang.String toString() {
                return "Sort{" +
                        "name='" + name + '\'' +
                        ", sal=" + sal +
                        ", age=" + age +
                        '}';
        }

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of employee");
        int n=sc.nextInt();
        System.out.println("Enter employee info");
        String name;
        int sal,age;

        ArrayList<Sort> al=new ArrayList<>();
        for(int i=1;i<=n;i++){
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter sal");
        sal=sc.nextInt();
        System.out.println("Enter age");
        age=sc.nextInt();
        al.add(new Sort(name,sal,age));
        }

        Comparator<Sort> comp=(o1,o2)->o1.sal-o2.sal;
        Comparator<Sort> comp1=(o1,o2)->o1.age-o2.age;
        Comparator<Sort> comp2=(o1,o2)->o1.name.compareTo(o2.name);

        al.sort(comp.thenComparing(comp1).thenComparing(comp2).reversed());

        al.forEach(System.out::println);
        }

}