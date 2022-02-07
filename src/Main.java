import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //Method
        kelulusan abby = new kelulusan();
        kelulusan abizar = new kelulusan();
        kelulusan nabil = new kelulusan();
        kelulusan reza = new kelulusan();

        System.out.println("Masukkan nomor absen anda: ");
        int absensi = sc.nextInt();

        switch (absensi){
            case 1:
                kelulusan.abby();
                break;
            case 2:
                kelulusan.abizar.abizar();
                break;
            case 3:
                kelulusan.nabil.Nabil();
                break;
            case 4:
                kelulusan.reza.Reza();
                break;
        }
    }
}
