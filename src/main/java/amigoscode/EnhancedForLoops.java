package amigoscode;

import java.util.Arrays;

public class EnhancedForLoops {
    public static void main(String[] args) {
        int[] numbers= {2,0,1,4,100,4,90,78,77};
        String[]names={"Anna","Ali"};
        //gives you access to the actual index
        for(int x=0;x<numbers.length;x++){
            System.out.println(numbers[x]);
            //type name of variable, then type . and see fori or forr option to quickly create for loop
        }
        System.out.println("Enhanced for loop");
        //for numbers take the indivual numbers one by one and put it in the variable "number"
        for(String name:names){
            System.out.println(name);
        }
        Arrays.stream(numbers).forEach(System.out::println);
        Arrays.stream(names).forEach(System.out::println);
    }
}
