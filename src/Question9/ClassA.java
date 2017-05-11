package Question9;

/**
 * Created by TXS0403 on 5/10/2017.
 */
public class ClassA {
    //Private Fields used for Encapsulation
    private double a;
    private double b;

    //Default constructor that defaults the fields to zero.
    ClassA(){
        a = 0;
        b = 0;
    }

    //Encapsulation
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public void setA(double x1){
        a = x1;
    }
    public void setB(double x2){
        b = x2;
    }

}
