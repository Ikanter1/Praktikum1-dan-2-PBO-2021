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
public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaSewa;
    
    int bayar(int harga, int lamaSewa){
        this.harga = harga;
        this.lamaSewa = lamaSewa;
        return harga*lamaSewa;
    }
    
    public void tampilData(){
        System.out.println("ID           : "+id);
        System.out.println("Nama Member  : "+namaGame);
        System.out.println("Nama Game    : "+namaMember);
        System.out.println("Harga/Hari   : "+harga);
        System.out.println("Lama Menyewa : "+lamaSewa);
    }
}
