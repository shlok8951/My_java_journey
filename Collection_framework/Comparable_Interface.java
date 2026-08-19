import java.util.*;
import java.util.stream.Gatherer.Integrator;

public class Comparable_Interface {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Shlok",99));
        list.add(new Student("Rohit",29));
        list.add(new Student("Mahesh",95));
        list.add(new Student("Manoj",79));

        Collections.sort(list);  //ascending

        for(Student s : list){
            System.out.println(s.name + " "+s.marks);
        }

       List<Integer> list2 = new ArrayList<>();
       list2.add(20);
       list2.add(30);
       list2.add(10);
       Collections.sort(list2);
    }
}
class Student implements Comparable<Student>{
    int marks;
    String name;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other){
        if(this.marks != other.marks)
            return this.marks-other.marks; // for acending order
        // return other.marks - this.marks //for decending order
        return this.name.compareTo(other.name);
    }

}
//this.marks - other.marks
//<0 then this.marks,other.marks
//>0 then other.marks,this.marks