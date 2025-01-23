package assignment3.interfaces.task7;

public class Solution {
    public static void main(String[] args) {
        // Access HOBBY without creating a Dream object
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());
    }

    interface Desire {
    }

    interface Dream {
        // Variables in interfaces are public, static, and final by default
        Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
