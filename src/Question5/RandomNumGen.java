package Question5;

/**
 * Created by TXS0403 on 5/9/2017.
 */
public class RandomNumGen {
    public static void main(String[] args) {
        for(int i = 1; i < 2;i++){
            randomNum(100);
        }
    }
    public static void randomNum(int range){
        System.out.println((int)(Math.random()*range));
    }
}
