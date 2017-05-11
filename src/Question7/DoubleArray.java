package Question7;

/**
 * Created by TXS0403 on 5/9/2017.
 */
public class DoubleArray {
    public static void main(String[] args) {
        int[][] darray ={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30},{31,32,33,34,35,36}};
        int greatest = darray[0][0];
        // Create loop to iterate through array
        for(int row = 0; row < darray.length; row++){
            for(int col = 0; col < darray.length; col++){
                if(darray[row][col] > greatest){
                    greatest = darray[row][col];
                }
            }
        }
        System.out.println("The Value of the Greatest Number in the Array is: " +greatest);
    }

}
