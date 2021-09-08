/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class JaketGunung extends Jaket{
    private String kain;
    
    public void setKainjaket(String newValue) {
        kain = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Jenis Kain : " + kain);
    }
}
