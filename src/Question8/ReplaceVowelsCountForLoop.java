package Question8;

/**
 * Created by TXS0403 on 5/10/2017.
 */
public class ReplaceVowelsCountForLoop {
    public static void main(String[] args) {
        String str = "Summertime";

        int charCount = 0;
        //Using a for loop to count the number of vowels
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||
                    str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                charCount++;
            }
        }
        //replace vowels using replaceAll
        String rvowels = str.replaceAll("[aeiouAEIOU]", "*");
        System.out.println(rvowels + "\n" + "The number of characters that was replaced is: " + charCount);
    }
}