package designpattern.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler {

    private Object sub; // 真实对象的引用

    public DynamicSubject(Object sub) {
        this.sub = sub;
    }

    /*	@Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("before calling " + method);
            method.invoke(sub, args);
            System.out.println("after calling " + method);
            return null;
        }*/
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println( "before calling" +method);
        Object obj = method.invoke(sub, args);
        System.out.println("after calling" +method);
        return obj;
    }
}