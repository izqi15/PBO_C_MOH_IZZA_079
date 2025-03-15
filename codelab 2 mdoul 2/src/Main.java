class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
        System.out.println();
    }

    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println("Berhasil setor: " + jumlah);
        System.out.println("Saldo saat ini: " + saldo);
        System.out.println();
    }

    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Berhasil tarik: " + jumlah);
            System.out.println("Saldo saat ini: " + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi untuk tarik: " + jumlah);
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank("123456789", "Nama Saya", 500000);
        RekeningBank rekening2 = new RekeningBank("987654321", "Nama Teman", 300000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setorUang(200000);
        rekening1.tarikUang(100000);

        rekening2.setorUang(50000);
        rekening2.tarikUang(400000);
    }
}