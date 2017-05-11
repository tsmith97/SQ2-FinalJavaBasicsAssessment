package Question11;

/**
 * Created by TXS0403 on 5/10/2017.
 */
public class ClassA extends ClassB implements InterfaceA {
    //ClassA inherits (extends) the method addition() from ClassB
    public static void main(String[] args) {
/*        int a = 20;
        int b = 30;*/
        ClassA classa = new ClassA();
        classa.addition(a,b);
    }
}
