package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by hughie on 17-7-3.
 * A
 */
public class ObjectHandler implements InvocationHandler{


    public Object bind(Object delegate) throws Exception {
        this.delegate = delegate;
        return Proxy.newProxyInstance(SubjectIml.class.getClassLoader(), new Class[]{SubjectIml.class},this);
    }

    private Object delegate;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("ObjectHandler.bind newProxyInstance-invoke start");
        Object retObj = method.invoke(delegate);//proxy, args);
        System.out.println("ObjectHandler.bind newProxyInstance-invoke end");
        return retObj;
    }
}
