import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //Method setiap siswa
        kelulusan abby = new kelulusan();//1
        kelulusan abizar = new kelulusan();//2
        kelulusan nabil = new kelulusan();//3
        kelulusan reza = new kelulusan();//4
        kelulusan adrian = new kelulusan();//5
        kelulusan farhan = new kelulusan();//6
        kelulusan tama = new kelulusan();//7
        kelulusan arumi = new kelulusan();//8
        kelulusan aurel = new kelulusan();//9
        kelulusan avifta = new kelulusan();//10
        kelulusan camel = new kelulusan();//11
        kelulusan karel = new kelulusan();//12

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
            case 5:
                kelulusan.adrian.adrian();
                break;
            case 6:
                kelulusan.farhan.farhan();
                break;
            case 7:
                kelulusan.tama.tama();
                break;
            case 8:
                kelulusan.arumi.arumi();
                break;
            case 9:
                kelulusan.aurel.aurel();
                break;
            case 10:
                kelulusan.avifta.avifta();
                break;
            case 11:
                kelulusan.camel.camel();
                break;
            case 12:
                kelulusan.carolina.karel();
                break;
        }
    }
}
