/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author ASUS TUF A15
 */
public class Kelas2 extends Siswa1 {
        int nomorabsen;
    public void keterangan(){
        super.Profesi();
        System.out.println("Pelajar");
    }
    public void setnomorabsen(int nomorabsen){
        this.nomorabsen=nomorabsen;
        System.out.println("Nomor         : "+nomorabsen);
    }
    public int getnomorabsen(){
        return nomorabsen;
    }
    public void gajiayah (int pokok){
    int total=pokok;
            System.out.println("Gaji utama yang didapat: Rp."+total);
}
    public void gajiibu (int pokok){
        int total=pokok;
        System.out.println("Gaji yang didapat jika bekerja dengan baik: Rp."+total);
    }
    
}
