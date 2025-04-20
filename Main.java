public class Main {
    public static void main(String[] args) {
        for (int i = 999999; i >= 1; i--) {
            long n = i;  // Use long to avoid overflow

            while (n != 1 && n < 1_000_000) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
            }
            if(n==1) {
                System.out.println("All numbers from 1 to 999999 reach 1.");
                return;
            }
        }


    }
}
