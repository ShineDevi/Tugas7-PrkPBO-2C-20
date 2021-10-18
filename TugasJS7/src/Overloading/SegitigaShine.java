/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author -LENOVO-
 */
public class SegitigaShine {
    int sudut, keliling;
    int totalSudut(int sudutA){
        sudut=180-sudutA;
        return sudut;
    }
    int totalSudut(int sudutA, int sudutB){
        sudut = 180-(sudutA + sudutB);
        return sudut;
    }
    int keliling(int sisiA, int sisiB, int sisiC){
        keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
    double keliling(int sisiA, int sisiB){
        double sisiC= Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB,2));
        keliling = (int) (sisiA + sisiB + sisiC);
        return (double)keliling;
    }
    public static void main(String[] args) {
        SegitigaShine s = new SegitigaShine();
        System.out.println("Hasil total sudut bila diketahui ukuran 1 sudut= "+s.totalSudut(87));
        System.out.println("Hasil total sudut bila diketahui ukuran 2 sudut= "+s.totalSudut(87,60));
        System.out.println("Hasil keliling segitiga bila diketahui ukuran 3 sisi= "+s.keliling(20, 10, 30));
        System.out.println("Hasil keliling segitiga bila diketahui ukuran 2 sisi= "+s.keliling(20, 10));
    }
    
}
