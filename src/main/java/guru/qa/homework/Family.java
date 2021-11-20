package guru.qa.homework;

import java.util.List;

public class Family {

  private Person father;
  private Person mother;
  private List<Person> child;

  public Person getFather() {
    return father;
  }

  public Person getMother() {
    return mother;
  }

  public List<Person> getChild() {
    return child;
  }

  public void setFather(Person father) {
    this.father = father;
  }

  public void setMother(Person mother) {
    this.mother = mother;
  }

  public void setChild(List<Person> child) {
    this.child = child;
  }

  public static void slogan() {
    System.out.println("\nThe family is sacred!");
  }

  public static class ParentSpecialty {

    private String fatherSpecialty;
    private String motherSpecialty;

    public String getFatherSpecialty() {
      return fatherSpecialty;
    }

    public String getMotherSpecialty() {
      return motherSpecialty;
    }

    public void setFatherSpecialty(String fatherSpecialty) {
      this.fatherSpecialty = fatherSpecialty;
    }

    public void setMotherSpecialty(String motherSpecialty) {
      this.motherSpecialty = motherSpecialty;
    }

    public void printParentSpecialty() {
      System.out.println("\nParent specialty");
      System.out.println("--------------------------");
      System.out.println("Father by specialty: " + fatherSpecialty);
      System.out.println("Mother by specialty: " + motherSpecialty);
    }

  }

}
