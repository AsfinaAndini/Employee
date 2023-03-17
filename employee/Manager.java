
package employee;


public class Manager extends Employee {
    int nipMN ;
    String namaMN ;
    String jbtnMN;
    int gajiMN;
    int potonganMN;
    int jkMN;
    String stsMN;
    
    
    @Override
  public float nip (){
  int nip = nipMN;
        System.out.println("NIP Anda \t: "+nipMN);
  return nip;
 }
    
  @Override
  public void nama (){
  String nama = namaMN ;
      System.out.println("Nama Anda \t: "+namaMN);
 }
  
  @Override
  public void jabatan (){
  String jabatan = jbtnMN;
      System.out.println("Jabatan Anda \t: "+jbtnMN);
 }
  
  @Override
  public float gaji (){
  int gaji = jkMN * 220000;
      System.out.println("Gaji Anda \t: "+gaji);
  return gaji;
 }
  
  @Override
  public float potongan (){
  int potongan = potonganMN * 100000;
      System.out.println("Potongan Gaji Anda Bulan Ini \t: "+potongan);
  return potongan;
 }
  
  @Override
  public float jamKrj (){
  int jamKrj = jkMN;
      System.out.println("Jumlah Jam Kerja Anda Bulan Ini \t: "+jkMN);
  return jamKrj;
 }
  
}
