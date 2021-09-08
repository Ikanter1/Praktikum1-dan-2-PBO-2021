/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class laptop {
    private String merek;
    private String warna;
    private int berat;
    private int ram;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    
    public void setWarna(String newValue){
        warna = newValue;
    }
    
    public void setBerat(int newValue){
        berat = newValue;
    }
    
    public void setRAM(int newValue){
        ram = newValue;
    }
    
    public void cetakStatus(){
        System.out.println("Merek Laptop : "+merek);
        System.out.println("Warna : "+warna);
        System.out.println("Berat Laptop : "+berat+"Kg");
        System.out.println("RAM Laptop : "+ram+" GB");
    }
}
