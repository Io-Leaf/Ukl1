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
public class ListSiswa {
     //pemeberian nilai pada array "listSiswa" dengan tipe class Siswa
    Siswa[] listSiswa = {
        new Siswa(1, "Lila" ,  "Batu"  , "0334", true),
        new Siswa(2, "Nari" , "Malang" , "0378", true),
        new Siswa(3, "Trita","Surabaya", "0355", true),
    };

    //method untuk menampilkan data list siswa
    public void viewSiswa(){
        System.out.println("======== List Siswa ========");
        System.out.println();
        System.out.println("ID \t Nama \t\t Alamat \t\t Status");
        for (Siswa listSiswa1 : listSiswa) {
            System.out.println(listSiswa1.getIdSiswa() + " \t " + listSiswa1.getNama() + " \t\t " + listSiswa1.getAlamat() + " \t\t " + listSiswa1.getStatus());
            System.out.println();
        }
    }


    public int cariSiswa(int id){
        int found = 0;
        //pencarian data berdasarkan id
        for (int i = 0; i < listSiswa.length; i++) {
            if (listSiswa[i].getIdSiswa() == id) {
                found = i; 
                //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;
    }


} 