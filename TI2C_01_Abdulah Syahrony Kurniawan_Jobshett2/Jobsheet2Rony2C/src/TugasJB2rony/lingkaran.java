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
public class lingkaran {
    public double phi;
    public double r;
    
    double hitungLuas(double phi, double r){
        this.phi = phi;
        this.r = r;
        return phi*r*r;
    }
    
    double hitungKeliling(double phi, double r){
        this.phi = phi;
        this.r = r;
        return 2*phi*r;
    }
}
