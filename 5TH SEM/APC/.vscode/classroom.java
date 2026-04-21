public class classroom {
    
     public static void main(String[] args) {
    System.out.println("this is starting poiint fo debugger");
    Student s1 = new Student("Upasana", "CSE", 90);
    Student s2 = new Student("Sonam", "CSE", 70);

    System.out.println("Initial knowledge: " + s1.knowledge);
    s1.study();
    System.out.println("After studying: " + s1.knowledge);

    s1.intro();
    s2.intro();

    s1.teach(s2);
    System.out.println("After teaching: " + s1.knowledge);

    s1.appear();
    s2.appear();

   
    s1.intro();
    s2.intro();
}

    static{
        System.out.println("This is static block");
    }
    
    
}
