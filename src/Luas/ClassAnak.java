/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luas;

/**
 *
 * @author ACER
 */
public class ClassAnak extends ClassInduk {
    
   double tinggi=5;//deklarasi variabel
   ClassInduk art= new ClassInduk();//buat objek dari kelas ClassInduk
   
   public void LKbamgun(){
       System.out.println("Luas Lingkaran   : "+art.hitungLuas());//menampilkan hasil luas lingkaran
        System.out.println("Keliling Lingkaran   : "+art.hitungKeliling());//menampilkan hasil keliling lingkaran
   }
   public double tabung(){
       return hitungLuas()*tinggi;
   }
   public double LTabung(){
       return (2*hitungLuas())+(hitungKeliling()*tinggi);
   }
}
