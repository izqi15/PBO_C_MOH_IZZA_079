import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("pilih login: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int pilihan = scan.nextInt();
        scan.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan 3 digit NIM terakhir: ");
            scan.nextLine();
        }

    }
}