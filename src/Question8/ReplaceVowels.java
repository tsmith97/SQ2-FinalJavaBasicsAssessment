package Question8;

/**
 * Created by TXS0403 on 5/9/2017.
 */
public class ReplaceVowels {
    public static void main(String[] args) {
        String str = "Its all most summertime";
        String rvowels = str.replaceAll("[aeiouAEIOU]","%");
        System.out.println(rvowels);

    }
        
}