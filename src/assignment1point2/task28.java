package assignment1point2;

public class task28 {
    public static void task28work () {
        int sum = 0;
        int num = 1;


        while (num <= 100) {
            if (num % 3 == 0) {
                num++;
                continue;
            }

            sum += num;
            num++;
        }

        System.out.println("sum: " + sum);
    }
}
