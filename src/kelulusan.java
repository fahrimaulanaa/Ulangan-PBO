public class kelulusan {
    static String nama = "Abby Satya Diananda";
    static int nilai = 70, absen = 1, nis = 16546;

    public static void abby(){
        System.out.println("Nama: "+nama);
        System.out.println("No Absen: "+absen);
        System.out.println("NIS: "+nis);
        System.out.println("Nilai produktif "+nama+" "+nilai);

        if (nilai >= 70){
            System.out.println("Maaf "+nama+" anda tidak lulus");
        }
    }
    class abizar{
        static String nama = "Abizar Nazha";
        static int nilai = 75, absen = 2, nis = 58135;

        public static void abizar(){
            System.out.println("Nama: "+nama);
            System.out.println("No Absen: "+absen);
            System.out.println("NIS: "+nis);
            System.out.println("Nilai Produktif "+nama+" "+nilai);

            if (nilai >= 70){
                System.out.println("Maaf "+nama+" anda tidak lulus");
            }else{
                System.out.println("Selamat "+nama+ "anda lulus");
            }
        }
    }
}
