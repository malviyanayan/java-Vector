//this is speacial for equals method

import java.util.Vector;

public class L1 {
    public static void main(String[] args) {
        Vector<Student> a = new Vector<Student>();
        a.add(new Student("raju" ,34));
        a.add(new Student("kaliya" ,4));
        a.add(new Student("gunjan" ,41));
        a.add(new Student("chotabheem" ,20));
        a.add(new Student("kaliya" ,10));


        System.out.println(a);
    }
}


class Student {
    String name ;
    int age;

    Student(String name ,int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals (Object obj){
        return this.name.equals(((Student)obj).name) && this.age == ((Student)obj).age;
    }

    public String toString(){
        return name + " - " + age;
    }
}