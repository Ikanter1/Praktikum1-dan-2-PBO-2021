/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Ponsel {
    private String merek;
    private String warna;
    private int baterai;
    private int android;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    
    public void setWarna(String newValue){
        warna = newValue;
    }
    
    public void setBaterai(int newValue){
        baterai = newValue;
    }
    
    public void setAndroid(int newValue){
        android = newValue;
    }
    
    public void cetakStatus() {
        System.out.println("Merek : " + merek);
        System.out.println("Warna : " + warna);
        System.out.println("Daya Baterai : " + baterai +"mAh");
        System.out.println("Versi Android : Android Ke "+android);
    }
}
