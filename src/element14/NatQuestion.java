package element14;

public class NatQuestion {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2); // this will return true, as they are the same values in the String pool

        System.out.println("s1 == s2 is = " + s1 == s2); // this will only return false, as these two strings should have been compared with equals method
        System.out.println("s1 == s2 is " + s1.equalsIgnoreCase(s2)); // this will return: s1 == s2 is true, as s1 and s2 are compared with the correct method
    }
}
