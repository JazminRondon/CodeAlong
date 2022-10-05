package brocode;

public class WrapperClass {
    public static void main(String[] args) {

        //wrapper class= provides a way to use primitive data types as reference data types
        //               reference data types contain useful methods
        //               can be used with collections (ex.ArrayList)

        //autoboxing= the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper class
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";
        //unboxing= the reverse of autoboxing. Automatic conversion of wrapper class to primitive
        if(b=='@'){
            System.out.println("this is true");
        }


    }

}
