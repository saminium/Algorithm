package ExpediaPrep;

/**
 * Created by szeru on 4/12/2019
 */
class  StaticClass {

    int data;

    public static void main(String[] args) {
        StaticClass sc = new StaticClass();
        System.out.println(sc.hashCode());
        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println(01 == 02);
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o1));

    }
}
