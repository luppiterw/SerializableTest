package tools;

import java.util.Scanner;

/**
 * Created by hughie on 2017/4/3.
 * For command line
 */
public class CmdParser {

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
    public  CmdParser(Scanner scanner) {
        this.scanner = scanner;
    }
    private Scanner scanner;
}
