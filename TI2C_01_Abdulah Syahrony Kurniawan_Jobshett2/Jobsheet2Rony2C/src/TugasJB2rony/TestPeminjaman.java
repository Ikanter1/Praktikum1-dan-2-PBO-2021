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
public class TestPeminjaman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Peminjaman pjm1 = new Peminjaman();
        Peminjaman pjm2 = new Peminjaman();
        
        pjm1.id = 01;
        pjm1.namaMember = "Rony";
        pjm1.namaGame = "Valorant";
        pjm1.harga = 10000;
        pjm1.lamaSewa = 20;
        pjm1.tampilData();
        System.out.println("Total Harga : " + pjm1.bayar(pjm1.harga, pjm1.lamaSewa));
        System.out.println("");
        
        pjm2.id = 01;
        pjm2.namaMember = "Rony";
        pjm2.namaGame = "Last Of Us";
        pjm2.harga = 30000;
        pjm2.lamaSewa = 10;
        pjm2.tampilData();
        System.out.println("Total Harga : " + pjm2.bayar(pjm1.harga, pjm2.lamaSewa));
        System.out.println("");
    }
    
}
