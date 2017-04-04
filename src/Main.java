import models.Person;
import models.PersonGroup;
import models.SingletonTest;
import models.enums.Gender;
import test.Tester;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World! Current Encoding = " + System.getProperty("file.encoding"));


//        SingletonTest writeSingletonTest = SingletonTest.INSTANCE;
//        Tester.SpaceSerial.saveSingletonTest(writeSingletonTest);
//        System.out.println("LoadSingletonTest1 => writeSingletonTest = " + writeSingletonTest +
//                " abc=" + writeSingletonTest.getAbc());

        SingletonTest readSingletonTest1 = Tester.SpaceSerial.loadSingletonTest();
        System.out.println("LoadSingletonTest1 => " + (readSingletonTest1 == null ? null : readSingletonTest1.toString()) +
                " abc=" + readSingletonTest1.getAbc());
        SingletonTest readSingletonTest2 = Tester.SpaceSerial.loadSingletonTest();
        System.out.println("LoadSingletonTest2 => " + (readSingletonTest2 == null ? null : readSingletonTest2.toString()) +
                " abc=" + readSingletonTest2.getAbc());


//        Person writePerson = new Person("wg", Gender.FEMALE, 20, true);
//        Tester.SpaceSerial.savePerson(writePerson);
//        Person readPerson = (Person)Tester.SpaceSerial.loadPerson();
//        System.out.println("LoadPerson => " + (readPerson == null ? null : readPerson.toString()));


//        PersonGroup writePersonGroup = new PersonGroup("lalala", 321, System.currentTimeMillis());
//        writePersonGroup.setGroupID(30);
//        Tester.SpaceSerial.savePersonGroup(writePersonGroup);
//        PersonGroup readPersonGroup = Tester.SpaceSerial.loadPersonGroup();
//        System.out.println("LoadPersonGroup => " + (readPersonGroup == null ? null : readPersonGroup.toString()));
    }

}
