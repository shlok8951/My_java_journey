import java.util.*;

public class Lambda_ {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Rohit", 44, 456));
        list.add(new Student("Mohit", 34, 56));
        list.add(new Student("Mahesh", 74, 236));
        list.add(new Student("Shlok", 97, 695));

        Comparator<Student> c1 = new SortByName();
        Comparator<Student> c2 = new SortByMarks();
        Comparator<Student> c3 = new SortByRollno();


       // Collections.sort(list);

       //Collections.sort(list,c1);

        // Collections.sort(list,new Comparator<Student>(){  //use anomious class
        //        @Override
        //        public int compare(Student s1 , Student s2){
        //        return s1.name.compareTo(s2.name);
        //         }
        //     }
        // );
        

        //Lambda functions mostly work on function interface it means only one abstract method in interface.
        Collections.sort(list , (s1,s2)->s1.marks-s2.marks); //using lamda function

        for(Student s: list){
            System.out.println(s.name +" "+ s.marks+ " "+s.rollno);
        }


        
    }
}

class SortByName implements Comparator<Student>{
    @Override
    public int compare(Student s1 , Student s2){
        return s1.name.compareTo(s2.name);
    }
}
class SortByMarks implements Comparator<Student>{
     @Override
    public int compare(Student s1 , Student s2){
        return s1.marks-s2.marks;
    }

}
class SortByRollno implements Comparator<Student>{
     @Override
    public int compare(Student s1 , Student s2){
        return s1.rollno - s2.rollno;
    }

}
class Student{
    String name ;
    int marks;
    int rollno;
    public Student(String name ,int marks,int rollno){
        this.name = name ;
        this.marks = marks;
        this.rollno = rollno;
    }
    // @Override
    // public int compareTo(Student s){
    //      return this.marks-s.marks;}
       
}
