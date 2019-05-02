package designPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by szeru on 12/16/2018
 */
public class DesignPatternMain {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Singleton singleton = Singleton.getInstance();
        singleton.setValue(1);
        System.out.println(singleton.getValue());

        Singleton singleton2 = Singleton.getInstance();

        singleton2.setValue(2);

        System.out.println(singleton2.getValue());

        Constructor constructor = Singleton.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);
        Singleton  singleton3 = (Singleton) constructor.newInstance();

        System.out.println("Test");

        SingltonDemo.INSTANCE.setValue(4);
    }
}
