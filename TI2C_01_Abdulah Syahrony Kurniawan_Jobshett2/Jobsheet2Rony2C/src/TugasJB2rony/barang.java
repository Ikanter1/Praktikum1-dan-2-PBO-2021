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
public class barang {
    public String kode;
    public String namaBarang;
    public int harga;
    public double diskon;
    
    public double hitungHargaJual(){
        return harga-(diskon*harga);
    }
    
    public void tampilData(){
        System.out.println("Kode         : "+kode);
        System.out.println("Nama Barang  : "+namaBarang);
        System.out.println("Harga Barang : "+harga);
        System.out.println("Diskon       : "+diskon);
    }
}
