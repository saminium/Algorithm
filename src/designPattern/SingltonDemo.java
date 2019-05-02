package designPattern;

public enum SingltonDemo {

    INSTANCE;

    int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
