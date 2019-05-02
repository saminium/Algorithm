package designPattern;

import java.io.Serializable;

/**
 * Created by szeru on 12/16/2018
 */
public class Singleton implements Serializable {

    public static Singleton instance;
    private int value;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    System.out.println("new Instance is Created....");
                    instance = new Singleton();
                    return instance;
                }
            }
        }
        System.out.println("existing Instance is returned....");
        return instance;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
    protected Object readResolve(){
        return instance;
    }
}
