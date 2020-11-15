package id.rendydermawan.massajenis;
/**
 * NAMA                 : Rendy Dermawan
 * KELAS                : IF1
 * NIM                  : 10119030
 * Deskripsi Program    : Program menghitung massa jenis. 
 * menggunakan metode pendekatan berbasis objek.
 */
public class MassaJenis {
    
    public static void main(String[] args) {
    Kubus kubus1 = new Kubus();
        kubus1.setSisi(5);
        kubus1.setMassa(250);
        
        System.out.println("=====Massa Jenis Kubus======");
        System.out.println("Sisi\t: " + kubus1.getSisi());
        System.out.println("Massa\t: " + kubus1.getMassa());
        
        System.out.println("\n======Hasil Perhitungan======");
        System.out.println("Volume\t: " + kubus1.hitungVolume(kubus1.getSisi()));
        System.out.println("Massa Jenis : " + kubus1.hitungMassaJenis(kubus1.getMassa(), kubus1.getSisi()));  
    }
    
}
