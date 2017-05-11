package Question3;

/**
 * Created by TXS0403 on 5/9/2017.
 */
public class ClassAInstantiation {
    public static void main(String[] args) {
        //Instantiate to reach out to identifyClass method in ClassBInstantiation
        ClassBInstantiation myClass = new ClassBInstantiation();
        myClass.identifyClass();
    }
}
