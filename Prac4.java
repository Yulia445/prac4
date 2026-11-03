public class Prac4 {

    public static void main(String[] args) {
    }
// 1
    public static void printNumbers (int n) {
        if (n < 1) {
            return;
        }
        printNumbers((n - 1));
        System.out.print(n + " ");
    }
// 2
    public static void printAToB (int start, int end) {
        System.out.print(start + " ");

        if (start == end) {
            return;
        }

        if(start < end) {
            printAToB(start + 1, end);
        }else {
            printAToB(start - 1, end);
        }
    }
// 3
        public static void checkPowerOfTwo(long n) {
            if(n > 0 && (n & (n - 1)) == 0) {
                System.out.println("YES");
            } else  {
                System.out.println("NO");
            }
        }
// 4

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
// 5
    public static void printRightToLeft(int n) {
        if (n == 0) {
            return;
        }
        System.out.print((n % 10) + " ");
        printRightToLeft(n / 10);
    }
  // 6
    public static void printLeftToRight(int n) {
        if (n == 0) {
            return;
        }
        printLeftToRight(n / 10);
        System.out.print((n % 10) + " ");
    }

}


