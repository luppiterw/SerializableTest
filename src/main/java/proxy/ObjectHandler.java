package main.java.proxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by hughie on 17-7-3.
 * A
 */
public class ObjectHandler implements InvocationHandlerIml{
    @Override
    public Object invoke(Object proxy, Method method) throws Exception {
        return null;
    }

    public Object bind(Object delegate) throws Exception {
        this.delegate = delegate;
        return null;//Proxy.newProxyInstance(SubjectIml.class, this);
    }

    private Object delegate;
}
