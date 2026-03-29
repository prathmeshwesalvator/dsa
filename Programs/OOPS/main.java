package Programs.OOPS;

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(this.name + " " + this.age);
    }
}

public class main {

    public static void main(String[] args) {
        Student s1 = new Student("Prathmesh", 20);

        s1.display();
    }
}