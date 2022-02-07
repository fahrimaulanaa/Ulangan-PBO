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
        kelulusan cla = new kelulusan();//13
        kelulusan daffa = new kelulusan();//14
        kelulusan elzaim = new kelulusan();//15
        kelulusan fahri = new kelulusan();//16
        kelulusan grisel = new kelulusan();//17
        kelulusan gustaf = new kelulusan();//18
        kelulusan jihad = new kelulusan();//19
        kelulusan sephin = new kelulusan();//20
        kelulusan ulil = new kelulusan();//21
        kelulusan lintang = new kelulusan();//22
        kelulusan aris = new kelulusan();//23
        kelulusan dini = new kelulusan();//24
        kelulusan irsyad = new kelulusan();//25
        kelulusan farrel = new kelulusan();//26
        kelulusan nabila = new kelulusan();//27
        kelulusan nahiyah = new kelulusan();//28
        kelulusan alif = new kelulusan();//29
        kelulusan nia = new kelulusan();//30
        kelulusan pandu = new kelulusan();//31
        kelulusan reina = new kelulusan();//32
        kelulusan rakha = new kelulusan();//33
        kelulusan razaan = new kelulusan();//34
        kelulusan shandy = new kelulusan();//35
        kelulusan vanessa = new kelulusan();//36
        kelulusan yasmin = new kelulusan();//37
        kelulusan eca = new kelulusan();//38


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
            case 13:
                kelulusan.cla.cla();
                break;
            case 14:
                kelulusan.daffa.daffa();
                break;
            case 15:
                kelulusan.elzaim.elzaim();
                break;
            case 16:
                kelulusan.fahri.fahri();
                break;
            case 17:
                kelulusan.grisel.grisel();
                break;
            case 18:
                kelulusan.gustaf.gustaf();
                break;
            case 19:
                kelulusan.jihad.jihad();
                break;
            case 20:
                kelulusan.sephine.sephine();
                break;
            case 21:
                kelulusan.krisna.ulil();
                break;
            case 22:
                kelulusan.lintang.lintang();
                break;
            case 23:
                kelulusan.aris.aris();
                break;
            case 24:
                kelulusan.dini.dini();
                break;
            case 25:
                kelulusan.irsyad.irsyad();
                break;
            case 26:
                kelulusan.farrel.farrel();
                break;
            case 27:
                kelulusan.nabila.nabila();
                break;
            case 28:
                kelulusan.nahiyah.nahiyah();
                break;
            case 29:
                kelulusan.alif.alif();
                break;
            case 30:
                kelulusan.nia.nia();
                break;
            case 31:
                kelulusan.pandu.pandu();
                break;
            case 32:
                kelulusan.reina.reina();
                break;
            case 33:
                kelulusan.rakha.rakha();
                break;
            case 34:
                kelulusan.razaan.razaan();
                break;
            case 35:
                kelulusan.shandy.shandy();
                break;
            case 36:
                kelulusan.vanessa.vanessa();
                break;
            case 37:
                kelulusan.yasmin.yasmin();
                break;
            case 38:
                kelulusan.eca.eca();
                break;
            default:
                System.out.println("PARAMATER TIDAK VALID");
        }
    }
}
