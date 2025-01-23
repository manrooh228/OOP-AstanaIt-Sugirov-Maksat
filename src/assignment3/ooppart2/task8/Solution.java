package assignment3.ooppart2.task8;

public class Solution {
    public static void main(String[] args) {
        String s1 = new String("JavaITU");
        s1 = "JavaENU"; // Uncomment this line
        String s2 = "JavaENU";
        String s3 = "JavaENU";
        System.out.println(s1 == s3); // true
        System.out.println(s2.equals(s3)); // true
    }
}
