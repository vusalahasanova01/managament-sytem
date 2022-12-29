package model;

public class Student extends Person{
  private int scholarship;
  private String universtyName;

  public int getScholarship() {
    return scholarship;
  }

  public void setScholarship(int scholarship) {
    this.scholarship = scholarship;
  }

  public String getUniverstyName() {
    return universtyName;
  }

  public void setUniverstyName(String universtyName) {
    this.universtyName = universtyName;
  }
}
