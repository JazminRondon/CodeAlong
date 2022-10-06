package amigoscode;

public class BreakAndContinue {
    public static void main(String[] args) {
        String[]names={"Anna","Ali","Bob","Mike"};
        for (String name : names) {
            if(name.startsWith("A")){
                continue;
            }
            System.out.println(name);
        }
    }
}
