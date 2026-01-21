import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tinh chu vi Hinh chu nhat");
        System.out.print("Nhap chieu dai: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double rong = scanner.nextDouble();
        System.out.println("Chu vi Hinh chu nhat: " + (dai + rong)*2);

    }

}
