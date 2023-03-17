
package employee;


public class Internship extends Employee {
    int nipIS ;
    String namaIS ;
    String jbtnIS;
    int gajiIS;
    int potonganIS;
    int jkIS;
    String stsIS;
    
    
    @Override
  public float nip (){
  int nip = nipIS;
        System.out.println("NIP BOS \t: "+nipIS);
  return nip;
 }
    
    @Override
  public void nama (){
  String nama = namaIS ;
      System.out.println("Nama BOS \t: "+namaIS);
 }
  
    @Override
  public void jabatan (){
  String jabatan = jbtnIS;
      System.out.println("Jabatan \t: "+jbtnIS);
 }
  
    @Override
  public float gaji (){
  int gaji = jkIS * 70000;
      System.out.println("Gaji Anda \t: "+gaji);
  return gaji;
 }
  
    @Override
  public float potongan (){
  int potongan = potonganIS * 30000;
      System.out.println("Potongan Bulan Ini \t: "+potongan);
  return potongan;
 }
  
    @Override
  public float jamKrj (){
  int jamKrj = jkIS;
      System.out.println("Jumlah Jam Kerja Bulan Ini \t: "+jkIS);
  return jamKrj;
 }
            
}
