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
public class Main {
    public static void main(String[] args) {
        Manusia m=new Manusia();
        System.out.println("MANUSIA");
        m.info();
        System.out.println("");
        Dosen d=new Dosen();
        System.out.println("DOSEN");
        d.info();
        System.out.println("");
        Mahasiswa mhs=new Mahasiswa();
        System.out.println("MAHASISWA");
        mhs.info();
    }
}
