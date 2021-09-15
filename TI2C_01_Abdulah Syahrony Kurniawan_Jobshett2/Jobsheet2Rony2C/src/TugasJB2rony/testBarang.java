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
public class testBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        barang brg1 = new barang();
        barang brg2 = new barang();
        barang brg3 = new barang();
        
        brg1.kode = "154";
        brg1.namaBarang = "Keyboard";
        brg1.harga = 150000;
        brg1.diskon = 0.2;
        brg1.tampilData();
        System.out.println("Harga Jual : "+brg1.hitungHargaJual());
        System.out.println("");
        
        brg1.kode = "120";
        brg1.namaBarang = "Mouse";
        brg1.harga = 240000;
        brg1.diskon = 0.6;
        brg1.tampilData();
        System.out.println("Harga Jual : "+brg1.hitungHargaJual());
        System.out.println("");
        
        brg1.kode = "101";
        brg1.namaBarang = "RAM";
        brg1.harga = 3700000;
        brg1.diskon = 0.9;
        brg1.tampilData();
        System.out.println("Harga Jual : "+brg1.hitungHargaJual());
        System.out.println("");
    }
    
}
