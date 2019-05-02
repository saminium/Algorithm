package exercise;

import java.time.LocalDate;

/**
 * Created by szeru on 3/18/2019
 */
public class Singlton {

    private static Singlton instance;
    private Singlton(){
        System.out.println("Instance created ...." + LocalDate.now());
    }

    private static class SingletonInstance{
        private final static Singlton instance = new Singlton();
    }

    public static Singlton getInstance(){
        return SingletonInstance.instance;
    }


    public static Singlton getIns(){
        if(instance == null){
            synchronized (Singlton.class){
                if(instance == null){
                    return new Singlton();
                }
                return instance;
            }
        }
        return instance;

    }

}
