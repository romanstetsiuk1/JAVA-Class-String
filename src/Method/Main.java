package Method;

public class Main {

    public static void main(String[] args) {

//        1. length:
        String object_1 = "Hello ";
        String object_1a;
        object_1a = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore " +
                "et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut " +
                "aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum " +
                "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
                "officia deserunt mollit anim id est laborum.";
        System.out.println("Length of object 1 = " + object_1.length());
        System.out.println("Length of object 1a = " + object_1a.length());
        System.out.println("----------------------------------------------");

//        2. isEmpty
        String object_2 = "";
        System.out.println("\nObject 2 is empty? = " + object_2.isEmpty());
        System.out.println("Object 1 is empty? = " + object_1.isEmpty() + "\n");
        System.out.println("----------------------------------------------");

//        3. charAt
//        Returns the char value at the specified index.
        String object_3 = "Java.";
        char obj_3 = object_3.charAt(2);
        char obj_1a = object_1a.charAt(0);
        char obj_1 = object_1.charAt(2);
        System.out.println(obj_3 + "\t" + obj_1a + "\t" + obj_1 + "\n");
        System.out.println("----------------------------------------------");

//        4. codePointAt
//        Returns the character (Unicode code point) at the specified index.
        int obj_3_int = object_3.codePointAt(2);
        int obj_1a_int = object_1a.codePointAt(0);
        int obj_1_int = object_1.codePointAt(2);
        System.out.println(obj_1 + " in ASCII = " + obj_1_int + "\n" +
                obj_1a + " in ASCII = " + obj_1a_int + "\n" +
                obj_3 + " in ASCII = " + obj_3_int + "\n");
        System.out.println("----------------------------------------------");

//        5. codePointBefore
//        Return the character (Unicode before point) before the specified index.
        String object_5 = "LIKE!";
        int obj_5 = object_5.codePointBefore(2);
        System.out.println("In word " + object_5 + "index before nr 2: its index with number = " + obj_5);
        System.out.println("----------------------------------------------");

//        6. codePointCount
//        Return the number of Unicode code points in the specified text range of this String
        String object_6 = "codePointCount method use parameters: beginIndex (the first char of the text range) " +
                "and endIndex (the index after last char)";
        int codePointIndexByObj_6 = object_6.codePointCount(8,16);
        System.out.println("codePointCount by object_6 from index 8 by index 16 is: " + codePointIndexByObj_6);
        System.out.println("----------------------------------------------");


    }

}
