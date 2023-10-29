import java.util.Scanner;

public class SederhanaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        System.out.print("Masukkan angka pertama: ");
        num1 = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        num2 = input.nextDouble();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hasil penambahan: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Hasil pengurangan: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Hasil perkalian: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Hasil pembagian: " + (num1 / num2));
                } else {
                    System.out.println("Tidak dapat membagi oleh 0.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        input.close();
    }
}
