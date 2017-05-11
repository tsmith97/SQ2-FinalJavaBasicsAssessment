package Question10;

/**
 * Created by TXS0403 on 5/10/2017.
 */
public interface InterfaceB {
    // My Default method
    default void identifyInterface(){
        System.out.println("This is InterfaceB");
        returnStatic();
    }

    // My Static method (helps the interface). The Default Method calls this Static Method
    static void returnStatic(){
        System.out.println("This is a static method that is called from the Default Method");
    }
    //This is my Abstract Class and Method
    public abstract class Test{
        public abstract int AbMethod();
    }
}
