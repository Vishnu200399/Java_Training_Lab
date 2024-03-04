public class Test{
    public static void main(String[] args) {
        Student s1 = new Student();
    //    s1.rollno = 2111010696;
    //    s1.name = "Vishnu Vardhan"; 
    //    s1.display();
      s1.setStudentDetails(2111010696, "Vishnu Vardhan");
      s1.display();

    }
}


class Student {
    int rollno;
    String name;
    void setStudentDetails(int rollno,String name){
        this.rollno = rollno;
        this.name = name;

    }
    void display(){
        System.out.println("Roll Number:"+rollno+"\n"+"My Name is: "+name);
    }
}
