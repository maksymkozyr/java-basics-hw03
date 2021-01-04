import java.util.ArrayList;
import java.util.List;

public class Student {
  private int rating;
  private String name;


  public static List<Student> students = new ArrayList<>();

  public Student() {
    students.add(this);
  }

  public Student(String name) {
    this();
    this.name = name;
  }


  public static double getAvgRating() {
    if (students.size() ==0){
      return 0;
    }
    int sum = 0;
    for ( Student s : students){
      sum += s.rating;
    }
    return sum / (double)students.size();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }


  public boolean betterStudent(Student student) {
    return this.rating > student.rating;
  }

  public void changeRating(int rating) {
    this.setRating(rating);
  }


  public static void removeStudent(Student student) {
    students.remove(student);
  }

  @Override
  public String toString() {
    return name + " " + rating;
  }
}
