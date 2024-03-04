public class Student1 {
    public static void main(String[] args) {
        Student s1 = new Student(2111010696, "Vishnu vardhan");
        s1.display();

    }
}

class Student {
    int rollno;
    String name;
    String address;
    Student(){
        this.address = "HYD";
    }

    Student(int rollno, String name) {
        this();
        this.rollno = rollno;
        this.name = name;

    }

    void display() {
        System.out.println("Roll Number:" + rollno + "\n" + "My Name is: " + name+"\n"+"My address is:"+address);
    }
}
