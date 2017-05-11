package Question12;

/**
 * Created by TXS0403 on 5/10/2017.
 */
public class DivisionTwoNumsTryCatch {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num;
        try{
            num1 = 10;
            num2 = 0;
            num = num1 / num2;
            System.out.println("The result of dividing: "+num1+" and "+num2+" is: " +num);
        } catch(ArithmeticException ae){
            System.out.println("You can't divide a number by 0");
            //System.out.println(ae); //this will print "Exception in thread main java.lang.ArithmeticException:/ by zero"
          }

    }
}

