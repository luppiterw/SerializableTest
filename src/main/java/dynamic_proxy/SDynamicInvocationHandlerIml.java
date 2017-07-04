package dynamic_proxy;

import java.lang.reflect.Method;

/**
 * Created by hughie on 17-7-3.
 * Handler of invocation
 */
public interface SDynamicInvocationHandlerIml {
    Object invoke(Object proxy, Method method) throws Exception;
}
