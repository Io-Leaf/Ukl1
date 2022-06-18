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
import java.util.Scanner;



/**
 *
 * @author Member
 */
  public class Peminjaman {
         public static void main(String[] args) {
            
            SuperClass sambut = new SubClass();
            sambut.perpus();
            
            SuperClass info = new SubClass2 ();
            info.perpus();
               
            Petugas petugas = new Petugas();
            //pembuatanuntuk menangani input dari user
            Scanner input = new Scanner(System.in);

            //membuat variable utk mengondisikan program masih berjalan atau berhenti
            boolean stay = true;

            //pembuatan variabel utk menyimpan input user
            String key;

            //pembuatan object yg berisi daftar buku
            ListBuku listBuku = new ListBuku();

            //pembuatan object yg berisi daftar siswa
            ListSiswa listSiswa = new ListSiswa();

            Buku selectedBuku = null;
            //selama nilai "stay" = true maka program terus berjalan
            while (stay) {
                
                
                //tampilan menu
                System.out.println();
                System.out.println("Perpustakaan Moklet");
                System.out.println("1. List Buku");
                System.out.println("2. List Siswa");
                System.out.println("3. List Petugas");
                System.out.println("4. Peminjaman");
                System.out.println("5. Exit");
                System.out.print("Pilih menu: ");
                int menu = input.nextInt();

                if (menu == 1) {
                    System.out.println("---------------------------");
                    System.out.println("---------------------------\n");

                    // menampilkan daftar buku
                    listBuku.viewBuku();
                    System.out.println("Tekan nomer 1 untuk kembali ke menu awal");
                    key = input.next();
                } else if (menu == 2) {
                    System.out.println("---------------------------");
                    System.out.println("---------------------------\n");

                    //menampilkan daftar siswa
                    listSiswa.viewSiswa();
                    System.out.println("Tekan nomer 1 untuk kembali ke menu awal");
                    key = input.next();
                } else if (menu == 3) {
                    System.out.println("---------------------------");
                    System.out.println("---------------------------\n");

                    //menampilkan daftar siswa
                    petugas.tampilPetugas();
                    System.out.println("Tekan nomer 1 untuk kembali ke menu awal");
                    key = input.next();
                }else if (menu == 4) {
                    System.out.println("---------------------------");
                    System.out.println("!!Setiap siswa hanya boleh meminjam 1 buku!!");
                    System.out.println("---------------------------\n");
                    System.out.println("===== Peminjaman Buku =====");
                    System.out.println("---------------------------");
                    listSiswa.viewSiswa();
                    System.out.println();

                    //** variabel "selectedIDSiswa" utk menyimpan data id siswa yg dipilih,
                    // * variabel "selectedIDBuku" utk menyimpan data id buku yg dipilih

                    int selectedIDSiswa, selectedIDBuku;

                    System.out.print("Masukkan ID Siswa: ");
                    selectedIDSiswa = input.nextInt(); 

                    //"foundIndex" menyimpan posisi index dari data siswa yg dipilih
                    int foundIndex = listSiswa.cariSiswa(selectedIDSiswa);

                    //"selectedSiswa" menyimpan data siswa yg dipilih
                    Siswa selectedSiswa = listSiswa.listSiswa[foundIndex];

                    //Logika percabangan, jika true --> lanjut
                    if (selectedSiswa.isStatus()) {
                        //proses perubahan status siswa
                        listSiswa.listSiswa[foundIndex].changeStatus();

                        //menampilkan data buku
                        listBuku.viewBuku();

                        System.out.print("Pilih ID buku yang dipinjam: ");
                        selectedIDBuku = input.nextInt();
                        foundIndex = listBuku.cariBuku(selectedIDBuku);

                        //"selectedBuku" menyimpan data buku yg dipilih
                        selectedBuku = listBuku.listBuku[foundIndex];
                        System.out.println();
                        System.out.println("------ List Peminjaman ------");
                        System.out.println();
                        System.out.println("Judul Buku: " + selectedBuku.getJudulBuku());
                        System.out.println("Peminjam: " + selectedSiswa.getNama());
                        System.out.println();

                        //proses pengurangan stok
                        listBuku.listBuku[foundIndex].kurangiStok();

                    } else {
                        System.out.println("Maaf anda masih punya tanggungan buku");
                        System.out.print("Apakah anda ingin mengembalikan buku ? y/n : ");
                        key = input.next();
                        if (key.equalsIgnoreCase("Y") ) {
                            selectedSiswa.changeStatus();
                            assert selectedBuku != null;
                            selectedBuku.tambahStock();
                        }
                    }

                    } else if (menu == 5) {
                        System.out.println("Semangat membacanya !!!");
                        //variabel "stay" diset false menyebabkan program berhenti
                        stay = false;
                    }
                }
            }

        }