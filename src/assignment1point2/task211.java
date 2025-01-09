    package assignment1point2;

    public class task211 {
        public static void task211work() {
            int n = 10;
                for (int i = 0; i <= 10; i++) {
                
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" ");
                        if(j == i) {
                            System.out.print("8");
                        }
                    }
                    for (int j = n; j >= 1; j--) {
                        System.out.print("  ");
                        if(j == i) {
                            System.out.print("8");
                        }
                    }

                    System.out.println();
        
        }
        }
    }