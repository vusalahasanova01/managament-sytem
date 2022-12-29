package model;

public abstract class Person {
  private String name;
  private String surmame;
  private int age;

  public Person() {

  }

  public Person(String name, String surmame, int age) {
    this.name = name;
    this.surmame = surmame;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurmame() {
    return surmame;
  }

  public void setSurmame(String surmame) {
    this.surmame = surmame;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
