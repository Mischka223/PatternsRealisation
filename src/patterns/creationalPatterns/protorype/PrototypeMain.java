package patterns.creationalPatterns.protorype;

import java.util.StringJoiner;

import patterns.creationalPatterns.protorype.PrototypeMain.Cache;


public class PrototypeMain {

  public static void main(String[] args) {
    DB db = new DB();
    Student student = db.getStudent();

    Student cachedStudent = Cache.getCachedStudent();
    cachedStudent.setName("Andriy");

    System.out.println("db student = " + student);

    System.out.println("Cached student " + cachedStudent);
  }


 static class Cache {
    private static Student cachedStudent;

  public static void saveStudent(Student student){
    cachedStudent = student;
  }

  public static Student getCachedStudent(){
    return cachedStudent;
  }
 }
}


class Student implements Cloneable {
  private String name;
  private int age;


  public String getName() {
    return name;
  }

  public Student setName(String name) {
    this.name = name;
    return this;
  }


  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  @Override
  protected Student clone() throws CloneNotSupportedException {
    return (Student) super.clone();
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
        .add("name='" + name + "'")
        .add("age=" + age)
        .toString();
  }

}

class DB{

  private Student student;


  public Student getStudent() {
    Student student = new Student("Misha", 21);
    try {
      Cache.saveStudent(student.clone());
    } catch (CloneNotSupportedException e) {
      System.out.println("Method clone not supported");
      throw new RuntimeException("Method clone not supported");
    }
    return student;
  }
}
