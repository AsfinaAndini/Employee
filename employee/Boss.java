
package employee;


public class Boss extends Employee {
    int nipbos ;
    String namabos ;
    String jbtnbos;
    int gajibos;
    int potonganbos;
    int jkbos;
    
    
    @Override
  public float nip (){
  int nip = nipbos;
        System.out.println("NIP Anda \t\t\t: "+nipbos);
  return nip;
 }
    
  @Override
  public void nama (){
  String nama = namabos ;
      System.out.println("Nama Anda \t\t\t: "+namabos);
 }
  
  @Override
  public void jabatan (){
  String jabatan = jbtnbos;
      System.out.println("Jabatan Anda \t\t\t: "+jbtnbos);
 }
  
  @Override
  public float gaji (){
  int gaji = jkbos * 420000;
      System.out.println("Gaji Anda \t\t\t: "+gaji);
  return gaji;
 }
  
  @Override
  public float potongan (){
  int potongan = potonganbos * 200000;
      System.out.println("Potongan Gaji Anda Bulan Ini \t: "+potongan);
  return potongan;
 }
  
  @Override
  public float jamKrj (){
  int jamKrj = jkbos;
      System.out.println("Jumlah Jam Kerja Bulan Ini \t: "+jkbos);
  return jamKrj;
 }
  
  
}
