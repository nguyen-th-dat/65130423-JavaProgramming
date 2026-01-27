public class Bai_Tap_2 {
    public static void main(String[] args) {
        //old
//        System.out.println("   *   ");
//        System.out.println("  ***  ");
//        System.out.println(" ***** ");
//        System.out.println("*******");

        //new
        int n = 5; // Chieu cao

        for (int i = 0; i < n; i++) {
            // In khoang trang ben trai
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // In dau *
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Xuong dong
            System.out.println();
        }
    }
}
