import java.io.*;
class MenuMatriks
{
 public static void main(String[] args) throws Exception{
 DataInputStream input = new DataInputStream(System.in);
 MenuMatriks(){
  int i,b;
  int [] ax = new int[100];
  System.out.println("|=======================|");
  System.out.println("| 1.Penjumlahan matriks |");
  System.out.println("| 2.Pengurangan matriks |");
  System.out.println("| 3.Perkalian matriks   |");
  System.out.println("| 4.Keluar              |");
  System.out.println("|=======================|");
  try
  {
  System.out.print("Silahkan pilih menu : ");
  b = Integer.parseInt(input.readLine());
  switch (b)
  {
  case 1:
   ax=masukData();
   tambah(ax);
  break;
  case 2:
   ax=masukData();
   kurang(ax);
  break;
  case 3 :
   ax=masukData();
   kali(ax);
  break;
  case 4:
   System.out.println("BYE!!!");
   System.exit(0);
  
  }
  }
  catch (IOException o)
  {
  }
 }
  
  int[] masukData(){
  int i;
  int a=0;
  int [] arr = new int[100];
  int [] hasil = new int [100];
  
  try
  {
   System.out.println("Nilai matriks 1");
   System.out.println("");
  for (i=0;i<4;i++)
  {
   System.out.print("Masukan nilai matrik kolom ["+(i+1)+"] : ");
   arr[i]=Integer.parseInt(input.readLine());
  }
  System.out.println("\nNilai matriks 2");
   System.out.println("");
  for (i=4;i<8;i++)
  {
   System.out.print("Masukan nilai matrik kolom ["+(a+1)+"] : ");
   arr[i]=Integer.parseInt(input.readLine());
   a++;
  }
  System.out.println("\n\n\n");
  }
  catch(IOException e){
  }
  return (arr);
  }
  
  void tambah(int [] arr){
  int [] arrt = new int[100];
  int [] hasil = new int [100];
  arrt=arr;
  System.out.println("\n\n\n");
  hasil[0]=arrt[0]+arrt[4];
  hasil[1]=arrt[1]+arrt[5];
  hasil[2]=arrt[2]+arrt[6];
  hasil[3]=arrt[3]+arrt[7];
  System.out.println("| "+arrt[0]+"  "+arrt[1]+" |  "+" | "+arrt[4]+"  "+arrt[5]+" |  "+" | "+hasil[0]+"   "+hasil[1]+" | ");
  System.out.println("|      | + |      | = |       |");
  System.out.println("| "+arrt[2]+"  "+arrt[3]+" |  "+" | "+arrt[6]+"  "+arrt[7]+" | "+"  | "+hasil[2]+"   "+hasil[3]+" | ");
        System.out.println("");
  
 }

 void kurang(int[]arr){
  int [] arrk = new int[100];
  int [] hasil = new int [100];
  arrk=arr;
  System.out.println("\n\n\n");
  hasil[0]=arrk[0]-arrk[4];
  hasil[1]=arrk[1]-arrk[5];
  hasil[2]=arrk[2]-arrk[6];
  hasil[3]=arrk[3]-arrk[7];
  System.out.println("| "+arrk[0]+"  "+arrk[1]+" |  "+" | "+arrk[4]+"  "+arrk[5]+" |  "+" | "+hasil[0]+"   "+hasil[1]+" | ");
  System.out.println("|      | - |      | = |       |");
  System.out.println("| "+arrk[2]+"  "+arrk[3]+" |  "+" | "+arrk[6]+"  "+arrk[7]+" | "+"  | "+hasil[2]+"   "+hasil[3]+" | ");
        System.out.println("");
  
 }

 void kali(int[]arr){
  int [] arrkl = new int[100];
  int [] hasil = new int [100];
  arrkl=arr;
  System.out.println("\n\n\n");
  hasil[0]=(arrkl[0]*arrkl[4])+(arrkl[1]*arrkl[6]);
  hasil[1]=(arrkl[2]*arrkl[4])+(arrkl[3]*arrkl[6]);
  hasil[2]=(arrkl[0]*arrkl[5])+(arrkl[1]*arrkl[7]);
  hasil[3]=(arrkl[2]*arrkl[5])+(arrkl[3]*arrkl[7]);
  System.out.println("| "+arrkl[0]+"  "+arrkl[1]+" |  "+" | "+arrkl[4]+"  "+arrkl[5]+" |  "+" | "+hasil[0]+"   "+hasil[2]+" | ");
  System.out.println("|      | x |      | = |       |");
  System.out.println("| "+arrkl[2]+"  "+arrkl[3]+" |  "+" | "+arrkl[6]+"  "+arrkl[7]+" | "+"  | "+hasil[1]+"   "+hasil[3]+" | ");
        System.out.println("");
  
 }

 public static void main(String[] args)
 {
  MenuMatriks mm = new MenuMatriks();
 }
}
