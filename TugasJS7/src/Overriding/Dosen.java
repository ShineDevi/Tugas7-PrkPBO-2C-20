/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author -LENOVO-
 */
public class Dosen extends Manusia{
    @Override
    public void makan(){
        System.out.println("Dosen makan Nasi Padang");
    }
    public void lembur(){
        System.out.println("Dosen lembur");
    }
    @Override
    public void info(){
        super.info();
        this.lembur();
    }
}
