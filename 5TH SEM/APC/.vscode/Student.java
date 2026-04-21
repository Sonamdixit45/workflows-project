//import java.util.*;

class Student {
    String name;
    String department;
    int knowledge;
    int roll_no;

    static int roll_counter = 1;  

    
    public Student(String name, String department, int knowledge) {
        this.name = name;
        this.department = department;
        this.knowledge = knowledge;
        this.roll_no = roll_counter++;
    }

    public void intro() {
        System.out.println("Hello, my name is " + this.name + 
            ". My roll no is " + this.roll_no + 
            ". I'm studying in department " + this.department + 
            " having knowledge " + this.knowledge);
    }

    public void study() {
        System.out.println(this.name + " is studying...");
        this.knowledge += 20;
    }

    public void teach(Student s1) {
        System.out.println(this.name + " is teaching " + s1.name);
        this.knowledge += 20;
        s1.knowledge += 20;
    }

    public void appear() {
        if (this.knowledge >= 40) {
            System.out.println(this.name + " passed");
        } else {
            System.out.println(this.name + " failed");
        }
    }



}