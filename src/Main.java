import models.Person;
import test.Tester;

public class Main {

    public static void main(String[] args) {
        Tester.SpaceHashTable.printTimes(1_000_0000);
//        int pairCounter = 0;
//        for(Pair pair : propertyPairList) {
//            System.out.println((++pairCounter) + " " + pair.getKey().toString() + " = " + pair.getValue().toString());
//        }

//        Set<Map.Entry<Object, Object>> propertySet = System.getProperties().entrySet();
//        int counter = 0;
//        for(Map.Entry<Object, Object> o : propertySet) {
//            System.out.println((++counter) + " " + o.getKey().toString() + " = " + o.getValue().toString());
//        }
//        System.out.println("使用Set-Entry方式遍历" + (System.currentTimeMillis() - setTypeStartTime));

//        propertySet.i
        System.out.println("Encoding=" + System.getProperty("file.encoding"));
        System.out.println("Hello World!");

//        try {
//            int readResult = System.in.read();
//            System.out.println("System.in.read() = " + readResult);
//            Scanner scanner = new Scanner(System.in);
//            while(scanner.hasNext()) {
//                System.out.println("scanner.next() = " + scanner.next());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            int readResult;
//            while((readResult = System.in.read()) != 0) {
//                System.out.println("System.in.read() = " + readResult);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        Person person = new Person();
        Tester.savePerson(person);
    }


}
