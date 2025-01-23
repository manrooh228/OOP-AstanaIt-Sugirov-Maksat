package assignment3.interfaces.task13;

public class Solution {
    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }
}
