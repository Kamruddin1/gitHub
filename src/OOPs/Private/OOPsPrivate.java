package OOPs.Private;
class StudentDemo{
    // private key only, it can be use inside of the class
    // private key it can be use whole side of the class

    private String Name;
  private   int rollNo;
  private   int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public  void printDetails(){
        System.out.println("Name: " + Name);
        System.out.println("rollNo: " + rollNo);
        System.out.println("Age: " + age);
    }
}

public class OOPsPrivate {
    public static void main(String[] args) {
        StudentDemo stud1 = new StudentDemo();
        stud1.setRollNo(22);
        stud1.setName("ansari");
        stud1.setAge(23);


        stud1.printDetails();





    }
}
