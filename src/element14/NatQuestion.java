package element14;

public class NatQuestion {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2); // this will return true, as they are actually the same values (so has same ref
        // in the String Pool)

        System.out.println("s1 == s2 is = " + s1 == s2); // this will return false in the console. Based on the rules
        // of precedences of the operators, concatenation will go first. So we will concat the string with the
        // variable s1 the end result will be compared with s2.

        System.out.println("s1 == s2 is " + s1.equalsIgnoreCase(s2)); // this will return: s1 == s2 is true, as s1
        // and s2 are compared with equalsIgnoreCase method (compares the ref in the String pool, which is the same).

        System.out.println("s1 == s2 is " + (s1 == s2)); // this will return true due to brackets

        // for more info: https://learn.cybertekschool.com/courses/784/pages/string-intro?module_item_id=54787
        // https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
        // https://stackoverflow.com/questions/8095293/how-does-compare-memory-location#:~:text=So%20when%20%3D%3D%20is%20used,is%20the%20value%20it%20stores.

    }
}
