
package employee;

public class CleaningService extends Employee {
    int nipCS ;
    String namaCS ;
    String jbtnCS;
    int gajiCS;
    int potonganCS;
    int jkCS;
    String stsCS;
    
    
    @Override
  public float nip (){
  int nip = nipCS;
        System.out.println("NIP Anda \t: "+nipCS);
  return nip;
 }
    
  @Override
  public void nama (){
  String nama = namaCS ;
      System.out.println("Nama Anda \t: "+namaCS);
 }
  
  @Override
  public void jabatan (){
  String jabatan = jbtnCS;
      System.out.println("Jabatan Anda \t: "+jbtnCS);
 }
  
  @Override
  public float gaji (){
  int gaji = jkCS * 150000;
      System.out.println("Gaji Anda \t: "+gaji);
  return gaji;
 }
  
  @Override
  public float potongan (){
  int potongan = potonganCS * 30000;
      System.out.println("Potongan Gaji Anda Bulan Ini \t: "+potongan);
  return potongan;
 }
  
  @Override
  public float jamKrj (){
  int jamKrj = jkCS;
      System.out.println("Jumlah Jam Kerja Anda Bulan Ini \t: "+jkCS);
  return jamKrj;
 }
     
}
