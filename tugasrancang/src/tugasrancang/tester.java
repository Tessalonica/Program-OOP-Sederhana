/*TUGAS RANCANG 
TESSALONICA PUTRY AVRYLYA
672020167*/

package tugasrancang;
import java.io.IOException;
import java.util.Scanner;
public class tester {
private static int selectedMenu;
public static void main(String[] args) throws IOException 
{
    Scanner input=new Scanner (System.in);
    Scanner inputA=new Scanner (System.in);
    Scanner inputB=new Scanner (System.in);
    Scanner inputC=new Scanner (System.in);
    System.out.println("Tentukan jumlah mobil : ");
    int a=input.nextInt();
    menu mnu[]=new menu[a];
    mobil mbil[]=new mobil[a];
    int counter=0;
    for (int b=0; b<mnu.length; b++)
    {
    mnu[b]=new menu();
    }
    for (int b=0; b<mbil.length; b++)
    {
    mbil[b]=new mobil();
    System.out.println("Masukkan data untuk merk : ");
    mbil[b].merek=inputA.nextLine();
    System.out.println("Masukkan data untuk model : ");
    mbil[b].model=inputB.nextLine();
    System.out.println("Masukkan nama pemiliknya : ");
    mbil[b].setNama(inputC.nextLine());
    mnu[counter]=mbil[b];
    counter++;
    }
    do
    {
    System.out.println("");
    System.out.println("Menu Pengerjaan:");
    System.out.println("1. Cetak data mobil");
    System.out.println("2. Ubah data mobil");
    System.out.println("3. Tulis pemilik");
    System.out.println("4. Exit");
    System.out.println("Masukkan pilihan menu : ");
    int selectedMenu=input.nextInt();
    switch(selectedMenu)
    {
    case 1:
    for (int i = 0; i < mnu.length; i++) 
    {
    System.out.println("\nData ke "+i);
    mnu[i].cetak();
    }    
    break;
    case 3:
    System.out.println("Berikut nama pemilik mobil yang ada");
    for (int i = 0; i < mnu.length; i++) 
    {
    System.out.print(i+".");
    mnu[i].kata();
    }    
    break;
    case 2:
    System.out.print("\nPilih data yang ingin diubah: ");
    int ubah = input.nextInt();
    int i=ubah;
    if (i<a){
    System.out.println("");
    System.out.println("Pilih jenis data yang ingin diubah: ");
    System.out.println("1. Data merk");
    System.out.println("2. Data model");
    System.out.println("3. Data pemilik");
    System.out.println("4. Exit ");
    int abc = input.nextInt();
    switch(abc){
    case 1:
    mnu[i].merek1();
    break;
    case 2:
    mnu[i].model1();    
    break;
    case 3:
    mnu[i].nama1();
    break;
    case 4:
    System.out.println("");
    System.out.println("Keluar dari program, TERIMA KASIH ^-^");
    System.exit(0);         
    break;
    default:
    System.out.println("");
    System.out.println("Pilihan salah, kembali ke menu");
    break;
    }
    }
    else{System.out.println("Pilihan salah, kembali ke menu");
    }
    break;
    case 4:
    System.out.println("");
    System.out.println("Keluar dari program, TERIMA KASIH ^-^");
    System.exit(0);   
    break;
    default:
    System.out.println("");
    System.out.println("Pilihan salah, kembali ke menu");
    }
    }
    while(selectedMenu != 4);
    }
}