/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasJB2rony;

/**
 *
 * @author LENOVO
 */
public class Testlingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        lingkaran bgn1 = new lingkaran();
        lingkaran bgn2 = new lingkaran();
        lingkaran bgn3 = new lingkaran();
        
        System.out.println("Bangun 1");
        bgn1.phi = 3.14;
        bgn1.r = 10;
        System.out.println("Hitung Luas     : "+bgn1.hitungLuas(bgn1.phi, bgn1.r));
        System.out.println("Hitung Keliling : "+bgn1.hitungKeliling(bgn1.phi, bgn1.r));
        System.out.println("");
        
        System.out.println("Bangun 2");
        bgn2.phi = 3.14;
        bgn2.r = 20;
        System.out.println("Hitung Luas     : "+bgn2.hitungLuas(bgn2.phi, bgn2.r));
        System.out.println("Hitung Keliling : "+bgn2.hitungKeliling(bgn2.phi, bgn2.r));
        System.out.println("");
        
        System.out.println("Bangun 3");
        bgn3.phi = 3.14;
        bgn3.r = 30;
        System.out.println("Hitung Luas     : "+bgn3.hitungLuas(bgn3.phi, bgn3.r));
        System.out.println("Hitung Keliling : "+bgn3.hitungKeliling(bgn3.phi, bgn3.r));
    }
    
}
