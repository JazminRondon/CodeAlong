package amigoscode;

import java.util.Arrays;

public class UnderstandingMethods {
    public static void main(String[] args) {
        char[] letters= {'A','A','B','C','D','D','D'};
        int count=countOccurrences(letters,'D');
        System.out.println(count);
    }
    public static int countOccurrences(char[] letters,char searchLetter){
        int count=0;
        for (char letter : letters) {
            if(letter==searchLetter){
             count++;
            }
        }
 //       System.out.println("method countOccuraences was involked");
//        System.out.println(Arrays.toString(letters));
//        System.out.println(searchLetter);
        return count;
    }
}
