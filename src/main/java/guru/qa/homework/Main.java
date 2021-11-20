package guru.qa.homework;

import guru.qa.homework.Family.ParentSpecialty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Person ivan = new Person(LocalDate.parse("1990-05-07"), Gender.MALE);
    ivan.setLastName("Ivanov");
    ivan.setFirstName("Ivan");
    ivan.setMiddleName("Ivanovich");

    Person anastasia = new Person(LocalDate.parse("1993-04-27"), Gender.FEMALE);
    anastasia.setLastName("Ivanova");
    anastasia.setFirstName("Anastasia");
    anastasia.setMiddleName("Ivanovna");

    Person ekaterina = new Person(LocalDate.parse("2008-04-27"), Gender.FEMALE);
    ekaterina.setLastName("Ivanova");
    ekaterina.setFirstName("Ekaterina");
    ekaterina.setMiddleName("Ivanovna");

    Person petr = new Person(LocalDate.parse("2006-04-27"), Gender.MALE);
    petr.setLastName("Ivanova");
    petr.setFirstName("Petr");
    petr.setMiddleName("Ivanovich");

    List<Person> children = new ArrayList<>();
    children.add(ekaterina);
    children.add(petr);

    Family ivanovFamily = new Family();
    ivanovFamily.setFather(ivan);
    ivanovFamily.setMother(anastasia);
    ivanovFamily.setChild(children);
    ivanovFamily.getFather().printPersonInformation();
    ivanovFamily.getMother().printPersonInformation();
    for (int i = 0; i < ivanovFamily.getChild().size(); i++) {
      ivanovFamily.getChild().get(i).printPersonInformation();
    }

    Family.slogan();

    Family.ParentSpecialty parentSpecialty = new ParentSpecialty();
    parentSpecialty.setFatherSpecialty("Develop");
    parentSpecialty.setMotherSpecialty("Administrator");
    parentSpecialty.printParentSpecialty();
  }

}
