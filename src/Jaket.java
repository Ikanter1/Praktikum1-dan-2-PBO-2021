/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Jaket {
    private String ukuran;
    private String warna;
    private String merek;
    
    public void Merekjaket(String newValue) {
        merek = newValue;
    }

    public void WarnaJaket(String newValue) {
        warna = newValue;
    }
    
    public void setUkuranJaket(String newValue){
        ukuran = newValue;
    }
    
    public void cetakStatus() {
        System.out.println("Merek : " + merek);
        System.out.println("Warna : " + warna);
        System.out.println("Ukuran Jaket : " + ukuran);

    }
}
