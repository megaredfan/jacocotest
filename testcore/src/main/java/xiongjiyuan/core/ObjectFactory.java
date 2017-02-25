package xiongjiyuan.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Created by xiongjiyuan on 2017/2/25.
 */
public class ObjectFactory {
    public MockObject getObject() {
        return ((MockObject) Proxy.newProxyInstance(ObjectFactory.class.getClassLoader(), new Class[]{MockObject.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("method: " + method.getName());
                System.out.println("args: " + Arrays.toString(args));
                return null;
            }
        }));
    }
}
