import dynamic_proxy.SDynamicProxy;
import test.TestDynamicProxy;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World! Current Encoding = " + System.getProperty("file.encoding"));

        System.out.println("SDynamicProxy.class.getName()=" + SDynamicProxy.class.getName());
        TestDynamicProxy.test();
    }

}
