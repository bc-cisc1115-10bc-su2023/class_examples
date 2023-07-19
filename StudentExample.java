// Example of Student class and creating instances of class as objects
// Student class has constructors, getters, and setters
 
public class StudentExample {
  public static void main(String[] args){
    Student s1 = new Student();
    System.out.println(s1.getStudentName());
    
    // change name of s1
    s1.setStudentName("Mickey Mouse");
    System.out.println(s1.getStudentName());

    s1.setStudentNameAndId("James Bond", 007);
    System.out.println(s1.getStudentName());
    System.out.println(s1.getStudentNameAndId());

    // display 7 as 007
    System.out.printf("%03d\n",s1.getStudentId()); 

    // using string format method
    String s = String.format("%03d", s1.getStudentId());
    System.out.println(s); 


    Student s4 = new Student("Joe Biden", 1, 'A');
    Student s3 = new Student("Donald Trump", 2, 'F');
    Student s2 = new Student("Barack Obama", 3, 'A');

    // Shorthand notation to create an array of Student
    Student[] students = {s1, s2, s3, s4};

    // using for each
    for(Student student: students){
      System.out.println(student.getStudentNameAndId()); 
    }

  }

}

class Student {
    private String name;
    private int emplid;
    private char grade;

    // Constructors
    public Student(){
        name = "John Doe";
        emplid = 0;
        grade = 'W';
    }
    
    public Student(String name, int e){
        this.name = name;
        this.emplid = e;
        this.grade = 'W';
    }
    
    public Student(String n, int e, char g) {
        this.name = n;
        this.emplid = e;
        this.grade = g;
    }

    // Getter Methods
    public String getStudentName() {
      return this.name;
    }

    public String getStudentNameAndId() {
      String s = String.format("%03d", this.emplid);
      return this.name + " " + s;
    }

    public int getStudentId() {
      return this.emplid;
    }

    // Setter Methods
    public char getStudentGrade() {
      return this.grade;
    }

    public void setStudentName(String name) {
      this.name = name;
    }

    public void setStudentNameAndId(String name, int emplid) {
      this.name = name;
      this.emplid = emplid;
    }

    public void setStudentId(int emplid) {
      this.emplid = emplid;
    }

    public void setStudentGrade(char g) {
      this.grade = grade;
    }


}

