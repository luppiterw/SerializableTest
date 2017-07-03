package models;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * Created by hughie on 2017/4/4.
 * For Singleton test
 */
public class SingletonTest implements Serializable{
    private static final long serialVersionUID = -3764549935511906697L;

    private transient final long abc;
//    public static final SingletonTest INSTANCE = new SingletonTest();

    public long getAbc() {
        return abc;
    }
    public SingletonTest() {
        abc = 13;
        System.out.println("[SingletonTest.SingletonTest()] " + this.toString());
    }

    public void print() {
        System.out.println("[SingletonTest.print()] " + this.toString());
    }

    private void readObject(ObjectInputStream s) {
//        try {
//            s.defaultReadObject();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        abc = 232;
        System.out.println("[SingletonTest.readObject(ObjectInputStream)] " + this.toString());// + " ObjectInputStream=" + s.toString());
    }
//
//    private Object readResolve() {
//        System.out.println("[SingletonTest.readResolve()] " + this.toString());// + " ObjectInputStream=" + s.toString());
//        return INSTANCE;
//    }


//    private interface Instance {
//        final SingletonTest instance = new SingletonTest();
//    }
//    public static SingletonTest getInstance() {
//        return Instance.instance;
//    }

}
