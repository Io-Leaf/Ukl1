/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukls2;

/**
 *
 * @author USER
 */
public class SubClass2 extends SuperClass {
    
      Petugas penjaga = new Petugas();
      String jam = "Jam 07.00 sampai jam 17.00";
    
      @Override
    protected void perpus(){
    System.out.println();
            System.out.println("=====================Perpustakaan=====================");
            System.out.println("Nama Perpustakaan      : "+super.namaPerpus);
            System.out.println("Tempat Perpustakaan    : "+super.sekolah);
            System.out.println("Jumlah Keseluruhan Buku: "+super.jumlahBuku);
            System.out.println("Jam Buka               : perpustakaan dibuka mulai ");
            System.out.println("                         "+jam);
            System.out.println("Nama Petugas           : "+penjaga.namaPetugas);
            System.out.println("Jumlah Peminjaman      : "+jumlahPeminjaman);
            System.out.println("yang diperbolehkan ");
            System.out.println("Lama Meminjam          : paling lama "+ super.lama+ " hari");
            System.out.println();
    }
}
