package Encapsulation;
class Student{
          private String name;
          private String course;
          private int sid;
         public Student(String name,String course,int sid)
          {
                    super();
                    this.name=name;
                    this.course=course;
                    this.sid=sid;
          }
          public int getSid()
          {
                    return sid;
          }
          public void setid(int sid)
          {
                    this.sid=sid;
          }
          public String getCourse()
          {
                    return course;
          }

}

public class StudentMain {
          public static void main(string[]args){
Student s1=new Student("Student1","MCA");
s1.setid(2);
System.out.println("Sid="+s1.getsid());
System.out.println("Name="+s1.get());
System.out.println("Course="+s1.getcourse());
          }
          
}
