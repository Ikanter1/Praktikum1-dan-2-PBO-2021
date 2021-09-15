/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PercobaanRony2C;

/**
 *
 * @author LENOVO
 */
public class TestMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        
        mhs1.nim = 2041720037;
        mhs1.nama ="Rony";
        mhs1.alamat = "Pakis";
        mhs1.kelas = "2C";
        mhs1.tampilBiodata();
        System.out.println(" ");
        
        mhs1.nim = 2041720037;
        mhs1.nama ="Yanto";
        mhs1.alamat = "Blimbing";
        mhs1.kelas = "2C";
        mhs1.tampilBiodata();
        System.out.println("");
        
        mhs1.nim = 2041720037;
        mhs1.nama ="Zadah";
        mhs1.alamat = "Karlos";
        mhs1.kelas = "2C";
        mhs1.tampilBiodata();
    }
    
}
