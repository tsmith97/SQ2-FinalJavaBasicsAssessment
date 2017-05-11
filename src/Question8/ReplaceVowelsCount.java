package Question8;

/**
 * Created by TXS0403 on 5/9/2017.
 */
public class ReplaceVowelsCount {
    public static void main(String[] args) {
        String str = "Summertime";

        int charCount = 0;
        //Using a for each loop to count the number of vowels
        for(char ch:str.toCharArray()){
            if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')){
            charCount++;
            }
        }
        //replace vowels using replaceAll
        String rvowels = str.replaceAll("[aeiouAEIOU]","*");
        //System.out.println(rvowels);
        System.out.println(rvowels+ "\n"+ "The number of characters that was replaced is: "+charCount);

    }
}
