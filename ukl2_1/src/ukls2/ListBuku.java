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
public class ListBuku {
  //pemeberian nilai pada array "listBuku" dengan tipe class Buku
    Buku[] listBuku = {
        new Buku(1, "Sejarah",10,"Gramedia"),
        new Buku(2, "Kimia",  20, "    Ale"),
        new Buku(3, "Fisika", 15, "    Kuns"),
        new Buku(4, "Progdas",25,"Gagas"),
    };

    //method untuk menampilkan data list buku
    public void viewBuku(){
        System.out.println("============= List Buku =============");
        System.out.println();
        System.out.println("ID \t\t Judul \t\t\t Stok \t\t Penerbit");
        for (int i = 0; i < listBuku.length; i++) {
            System.out.println(listBuku[i].getIdBuku() + "\t\t" +
                    listBuku[i].getJudulBuku()+ " \t\t\t " +
                    listBuku[i].getStok()+"\t\t\t  " + listBuku[i].getPenerbit());
            System.out.println();
        }
    }

    public int cariBuku(int id){
        int found = 0;
        //pencarian data berdasarkan id
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].getIdBuku()== id) {
                found = i; 
                //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;        
    }

}