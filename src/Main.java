import java.util.Scanner;
/**
 * @author
 * NAMA     : Teguh Siswanto
 * KELAS    : PBO2
 * NIM      : 10117065
 * Deskripsi Program :
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Printer pri = new Printer();

        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama Anda : ");
        pri.setNama(scn1.nextLine());
        System.out.print("Mau cetak nama berapa kali ?  : ");
        pri.setJumlahCetak(scn2.nextInt());
        pri.cetak("Nama Anda : "+pri.getNama());
        pri.cetak(pri.getJumlahCetak(), pri.getNama());


    }
}
