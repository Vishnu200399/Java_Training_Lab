interface Printable
{
    void print();//by default all methods are "public static final"
}
abstract class Person implements Printable
{
    String name;
    char gender;
    String email;
    Person(String name,char gender,String email)
    {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }
}
class Staff extends Person
{
   private Double sallary;
   Staff(String name,char gender,String email,Double sallary)
   {
    super(name, gender, email);
    this.sallary = sallary;
   }
   public void print()
   {
    System.out.println("Staff:-"+this.name+"-"+this.gender+"-"+this.email+"-"+this.sallary);
   }
}
class Student extends Person
{
    private char grade;
    Student(String name,char gender,String email,char grade)
    {
        super(name,gender,email);
        this.grade = grade;
    }
  public void print(){
    System.out.println("Student:-"+this.name+"-"+this.gender+"-"+this.email+"-"+this.grade);
  }
}
public class testInterface {
    public static void main(String[] args) {
  Staff st = new Staff("rudaraVani", 'F', "RudraVani@gmail.com", 200000.00);
  Student s = new Student("VishnuVardhan", 'M', "Vishnu99@gmail.com", 'A');
  s.print();
  st.print();
  }
}
