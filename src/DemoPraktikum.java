/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class DemoPraktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Celana sual = new Celana();
    CelanaTraining trn = new CelanaTraining();
    Jaket jkt = new Jaket();
    JaketGunung gng = new JaketGunung();
    Ponsel hp = new Ponsel();
    laptop lap = new laptop();
    
        //Memanggil Metode Celana
        System.out.println("Celana");
        System.out.println(" ");
        sual.setMerek("Gabriele");
        sual.setWarna("Hitam Stonewash");
        sual.setUkuran(29);
        sual.cetakStatus();
        System.out.println("----------------------");
        
        //Memanggil Metode Celana Training
        System.out.println("Celana Training");
        System.out.println(" ");
        trn.setMerek("Adidas");
        trn.setWarna("Biru");
        trn.setUkuran(29);
        trn.setKainCelana("Spandek");
        trn.cetakStatus();
        System.out.println("----------------------");
        
        //Memanggil Metode Jaket
        System.out.println("Jaket");
        System.out.println(" ");
        jkt.Merekjaket("Hello Sunday");
        jkt.WarnaJaket("Hitam StoneWash");
        jkt.setUkuranJaket("L");
        jkt.cetakStatus();
        System.out.println("----------------------");
        
        //Memanggil Metode Jaket Gunung
        System.out.println("Jaket Gunung");
        System.out.println(" ");
        gng.Merekjaket("Eiger");
        gng.WarnaJaket("Merah dan Hitam");
        gng.setUkuranJaket("L");
        gng.setKainjaket("WaterResist");
        gng.cetakStatus();
        System.out.println("----------------------");
        
        //Memanggil Metode Ponsel
        System.out.println("Ponsel");
        System.out.println(" ");
        hp.setMerek("VIVO");
        hp.setWarna("Biru Laut");
        hp.setBaterai(5000);
        hp.setAndroid(10);
        hp.cetakStatus();
        System.out.println("----------------------");
        
        //Memanggil Metode Laptop
        System.out.println("Laptop");
        System.out.println(" ");
        lap.setMerek("Lenovo Legion 5i");
        lap.setWarna("Hitam");
        lap.setBerat(2);
        lap.setRAM(16);
        lap.cetakStatus();
        System.out.println("----------------------");
    }
    
}
