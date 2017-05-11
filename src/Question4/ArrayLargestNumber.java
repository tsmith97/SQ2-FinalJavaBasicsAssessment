package Question4;

/**
 * Created by TXS0403 on 5/9/2017.
 */
public class ArrayLargestNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int largest = nums[0];

        // Create loop to iterate through array
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        System.out.println("The Largest number in the Array is: " +largest);

    }
}
