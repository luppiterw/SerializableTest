package test;

import dynamic_proxy.SDynamicInvocationHandlerIml;
import dynamic_proxy.SDynamicLiteratureSubject;
import dynamic_proxy.SDynamicObjectHandler;
import dynamic_proxy.SDynamicSubjectIml;

/**
 * Created by hughie on 17-7-4.
 * Test dynamic proxy
 *
 * Refer to http://blog.csdn.net/minidrupal/article/details/24888271
 */
public class TestDynamicProxy {
    public static void test() {
        SDynamicSubjectIml sub1=new SDynamicLiteratureSubject();

        SDynamicObjectHandler handler=new SDynamicObjectHandler();

        SDynamicSubjectIml sub2= null;
        try {
            sub2 = (SDynamicSubjectIml) handler.bind(sub1);
            sub2.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
