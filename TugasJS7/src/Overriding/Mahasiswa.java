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
public class Mahasiswa extends Manusia{
    @Override
    public void makan(){
        System.out.println("Mahasiswa makan mie Gacoan");
    }
    public void tidur(){
        System.out.println("Mahasiswa tidur");
    }
    @Override
    public void info(){
        super.info();
        this.tidur();
    }
}
