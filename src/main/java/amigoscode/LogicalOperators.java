package amigoscode;

public class LogicalOperators {
    public static void main(String[] args) {
        //Logical Operators
        boolean isAdult= false;
        boolean isStudent=true;
        boolean isAmigoCodeMemeber=true;
        //check if first if true, if true will continue to the next expression
        //both expression have to be true to print out true
        System.out.println(isAdult && isStudent);
        //either one has to be true to print out true
        System.out.println(isAdult || isStudent);
        //or
        System.out.println((isAdult || isStudent)&& isAmigoCodeMemeber);
        //flip values      (is not an adult)! flips value
        System.out.println((!isAdult || isStudent)&& isAmigoCodeMemeber);
        //check if variable is true
        System.out.println(isAdult);
        //flip
        System.out.println(!isAdult);
        String name="Mark";
        System.out.println((10>8 || 2<=2)&&
                !isAdult &&
                name.contains("M"));



    }
}
