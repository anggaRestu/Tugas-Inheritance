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
public class NewMain {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ClassAnak art =new ClassAnak();//buat objek dari kelas ClassAnak
        art.LKbamgun();//membuat objek sesuai method kelas ClassAnak
        System.out.println("volume   : "+art.tabung());//menampilkan hasil volume tabung
        
    }
    
}
