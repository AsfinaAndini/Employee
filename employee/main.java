
package employee;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Boss bos = new Boss ();
        System.out.print("Masukkan NIP Anda \t\t\t\t: ");
      bos.nipbos = scan.nextInt();
        System.out.print("Masukkan Nama Anda \t\t\t\t: ");
      bos.namabos = scan.next();
        System.out.print("Masukkan Jabatan Anda \t\t\t\t: ");
      bos.jbtnbos =scan.next();
      // jumlah jam kerja full selama 1 bulan adalah 210 jam
        System.out.print("Masukkan Potongan jam kerja Anda Selama 1 Bulan : ");
      bos.potonganbos = scan.nextInt();
        System.out.print("Masukkan Jam Kerja Anda Selama 1 Bulan \t\t: ");
      bos.jkbos =scan.nextInt() ;
      
        System.out.println("===========================================================");
        
      Manager mngr = new Manager ();
      System.out.print("Masukkan NIP Anda \t\t\t\t: ");
      mngr.nipMN = scan.nextInt();
        System.out.print("Masukkan Nama Anda \t\t\t\t: ");
      mngr.namaMN = scan.next();
        System.out.print("Masukkan Jabatan Anda \t\t\t\t: ");
      mngr.jbtnMN =scan.next();
      // jumlah jam kerja full selama 1 bulan adalah 210 jam
        System.out.print("Masukkan Potongan jam kerja Anda Selama 1 Bulan : ");
      mngr.potonganMN = scan.nextInt();
        System.out.print("Masukkan Jam Kerja Anda Selama 1 Bulan \t\t: ");
      mngr.jkMN =scan.nextInt() ;
      
        System.out.println("===========================================================");
      
       CleaningService Cs = new CleaningService ();
       System.out.print("Masukkan NIP Anda \t\t\t\t: ");
      Cs.nipCS = scan.nextInt();
        System.out.print("Masukkan Nama Anda \t\t\t\t: ");
      Cs.namaCS = scan.next();
        System.out.print("Masukkan Jabatan Anda \t\t\t\t: ");
      Cs.jbtnCS =scan.next();
      // jumlah jam kerja full selama 1 bulan adalah 210 jam
        System.out.print("Masukkan Potongan jam kerja Anda Selama 1 Bulan : ");
      Cs.potonganCS = scan.nextInt();
        System.out.print("Masukkan Jam Kerja Anda Selama 1 Bulan \t\t: ");
      Cs.jkCS =scan.nextInt() ;
      
        System.out.println("===========================================================");
        
        Internship ISP =new Internship();
        System.out.print("Masukkan NIP Anda \t\t\t\t: ");
      ISP.nipIS = scan.nextInt();
        System.out.print("Masukkan Nama Anda \t\t\t\t: ");
      ISP.namaIS = scan.next();
        System.out.print("Masukkan Jabatan Anda \t\t\t\t: ");
      ISP.jbtnIS =scan.next();
      // jumlah jam kerja full selama 1 bulan adalah 210 jam
        System.out.print("Masukkan Potongan jam kerja Anda Selama 1 Bulan : ");
      ISP.potonganIS = scan.nextInt();
        System.out.print("Masukkan Jam Kerja Anda Selama 1 Bulan \t\t: ");
      ISP.jkIS =scan.nextInt() ;
      
        System.out.println("===========================================================");
        System.out.println("===========================================================");
        System.out.println(""); 
        
      bos.nip();
      bos.nama();
      bos.jabatan();
      bos.jamKrj();
        System.out.println("Gaji Kotor \t\t\t: 88.200.000");
      bos.potongan();
      bos.gaji();
      
        System.out.println("");
        System.out.println("***********************************************************");
        System.out.println("");
        
      mngr.nip();
      mngr.nama();
      mngr.jabatan();
      mngr.jamKrj();
      mngr.potongan();
      mngr.gaji();
      
        System.out.println("");
        System.out.println("***********************************************************");
        System.out.println("");
        
      Cs.nip();
      Cs.nama();
      Cs.jabatan();
      Cs.jamKrj();
      Cs.potongan();
      Cs.gaji();
      
        System.out.println("");
        System.out.println("***********************************************************");
        System.out.println("");
        
      ISP.nip();
      ISP.nama();
      ISP.jabatan();
      ISP.jamKrj();
      ISP.potongan();
      ISP.gaji();
      
        System.out.println("");
        System.out.println("***********************************************************");
        System.out.println("");
        
    }
   
}
