package tugasrancang;
import java.util.Scanner;
public class menu 
{
    protected String roda;
    protected String merek;
    protected String model;
    public void cetak()
    {
    System.out.println(model);
    } 
    public void kata()
    {
    System.out.println(model);
    } 
    void merek1() 
    {
    throw new UnsupportedOperationException(""); 
    }
    void model1() 
    {
    throw new UnsupportedOperationException(""); 
    }
    void nama1() 
    {
    throw new UnsupportedOperationException(""); 
    }
}
class mobil extends menu{
private String nama;
public mobil()
    {
    roda="4";
    }
public void cetak()
    {
    System.out.println("Jumlah Roda : "+roda);
    System.out.println("Merek : "+merek);
    System.out.println("Nama Model : "+model);
    System.out.println("Nama Pemilik : "+nama);
    }
public void setNama(String nama)
    {
    this.nama = nama;
    }
public String getNama()
    {
    return nama;
    }
public void kata()
    {
    System.out.printf(" %s\n",getNama());
    }
public void merek1()
    {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Masukkan data penggantinya: ");
    merek=keyboard.nextLine();
    }
public void model1()
    {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Masukkan data penggantinya: ");
    model=keyboard.nextLine();
    }
public void nama1()
    {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Masukkan data penggantinya: ");
    nama=keyboard.nextLine();
    }
}
