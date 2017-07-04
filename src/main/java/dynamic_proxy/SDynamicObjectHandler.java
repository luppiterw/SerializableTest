package dynamic_proxy;

import java.lang.reflect.Method;

/**
 * Created by hughie on 17-7-3.
 * A
 */
//public class SDynamicObjectHandler implements InvocationHandler {
public class SDynamicObjectHandler implements SDynamicInvocationHandlerIml {


    public Object bind(Object delegate) throws Exception {
        this.delegate=delegate;
        //SDynamicProxy 就是要生成代理类的类，SDynamicSubjectIml.class 是要被代理的类所实现的接口
        return SDynamicProxy.newProxyInstance(SDynamicSubjectIml.class,this);
//        return Proxy.newProxyInstance(SDynamicSubjectIml.class.getClassLoader(), new Class[]{SDynamicSubjectIml.class},this);
    }

    private Object delegate;
    //invoke()方法是被自动生成的代理类调用，不用我们直接调用
    @Override
    public Object invoke(Object proxy, Method method) throws Exception {
        Object result=null;
        System.out.println("Proxy: SDynamicObjectHandler.invoke start");
//把被代理类对象传进去，通过反射技术调用被代理类的方法，
        method.invoke(delegate);
        System.out.println("Proxy: SDynamicObjectHandler.invoke end");
        return result;
    }

//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("SDynamicObjectHandler.bind newProxyInstance-invoke start");
//        Object retObj = method.invoke(delegate);//proxy, args);
//        System.out.println("SDynamicObjectHandler.bind newProxyInstance-invoke end");
//        return retObj;
//    }
}
