package Question13;

/**
 * Created by TXS0403 on 5/10/2017.
 */
public class ClassB {
    public static void identifyClass(){
        //Handling the Errors
        try{
            identifyClass();
        }catch(Exception e){
            System.out.println("Pro-Active Developer!");
        }
    }
    public void doLazy() throws Exception{
        //Using throws Exception
        System.out.println("Lazy Developer!!!");
        throw new Exception("Stop being lazy and use a Try and Catch!");
    }

}
