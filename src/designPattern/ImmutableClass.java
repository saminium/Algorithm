package designPattern;

/**
 * Created by szeru on 12/17/2018
 */
public final class ImmutableClass {

    final String name;
    final int id;
    public ImmutableClass(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}


abstract class Drawing {

    public final void imagesize(){

    }
    public abstract void imagesize(int size);
}

class Rectangle extends Drawing {


    @Override
    public void imagesize(int size) {

    }
}