import java.time.LocalDate;
import java.util.Scanner;
public class codelab {
    public static void main(String[] args) {
        String nama;
        char kelamin;
        int tahun_lahir, umur;
        Scanner scan = new Scanner(System.in);

        System.out.print("masukkan nama: ");
        nama = scan.nextLine();

        System.out.print("masukkan jenis kelamin (L atau P): ");
        kelamin = scan.next().charAt(0);

        String jeniskelamin;
        switch(kelamin) {
            case 'L':
            case 'l':
                jeniskelamin = "Laki-laki";
                break;
            case 'P':
            case 'p':
                jeniskelamin = "perempuan";
                break;
            default:
                jeniskelamin = "tidak diketahui";
                break;
        }

        System.out.print("masukkan tahun lahir: ");
        tahun_lahir = scan.nextInt();
        umur = LocalDate.now().getYear() - tahun_lahir;

        System.out.println("\n = Data diri: ");
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis kelamin   : " + kelamin);
        System.out.println("umur            : " + umur + " tahun");

        scan.close();
    }
}