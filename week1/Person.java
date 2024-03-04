public class Person 
{
    private String name;
    private char gender;
    private String email;
    Person(String name,char gender,String email)
    {
      this.name = name;
      this.email = email;
      this.gender  = gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return getName()+"("+getGender()+") at "+getEmail();
    }
    public static void main(String[] args) {
        Person p = new Person("vishnu",'M',"hackingup3@gmail.com");
        // System.out.println(p.getName()+"("+p.getGender()+")"+p.getEmail( ));
        System.out.println(p.toString());
        p.setEmail("Akhil99@rediff.com");
        System.out.println(p.toString());

    }
    
}
