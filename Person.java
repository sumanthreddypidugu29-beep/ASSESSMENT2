class Person {


    Person() {
        System.out.println("Person constructor called");
    }


    void message() {
        System.out.println("This is Person class message");
    }
}
class Student extends Person {


    Student() {
        super(); // calling parent constructor
        System.out.println("Student constructor called");
    }


    void message() {
        super.message(); // calling parent method
        System.out.println("This is Student class message");
    }



    public static void main(String[] args) {

        Student s = new Student();
        s.message();
    }
}

