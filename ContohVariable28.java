public class ContohVariable28{
    public static void main(String[] args) {
        String hobi = "Bermain petak umpet";
        boolean pandai = true;
        char jenisKelamin = 'L';
        byte umur = 20;
        double $ipk = 3.24, tinggi = 1.78;

        System.out.println(hobi);
        System.out.println("Apakah pandai? " + pandai);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}