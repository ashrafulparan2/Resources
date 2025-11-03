class Student {
    String name;
    int id;

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

public class ClassObjectExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Jim";
        s1.id = 101;
        s1.display();
    }
}
