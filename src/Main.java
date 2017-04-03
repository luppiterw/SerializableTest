import models.Person;
import models.enums.Gender;
import test.Tester;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World! Current Encoding = " + System.getProperty("file.encoding"));


        Person writePerson = new Person("wg", Gender.FEMALE, 20, true);
        Tester.SpaceSerial.savePerson(writePerson);

        Person readPerson = (Person)Tester.SpaceSerial.loadPerson();
        System.out.println("LoadPerson = " + (readPerson == null ? null : readPerson.toString()));


    }


}
