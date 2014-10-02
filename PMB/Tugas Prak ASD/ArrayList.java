import java.util.ArrayList;

public class MyArray {
 public static void main(String[] args) { 
  //buat ArrayList
  ArrayList arrList = new ArrayList();
  System.out.println("Ukuran ArrayList awal : "+arrList.size());
  System.out.println("Isi ArrayList awal : "+arrList);
  
  //tambahkan element ke ArrayList
  arrList.add("zero");
  arrList.add("one");
  arrList.add("two");
  arrList.add("three");
  arrList.add("four");
  System.out.println("Ukuran ArrayList sekarang : "+arrList.size());
  System.out.println("Isi ArrayList sekarang : "+arrList);
  
  //delete elemen ArrayList
  arrList.remove("two");
  System.out.println("Ukuran ArrayList sekarang : "+arrList.size());
  System.out.println("Isi ArrayList sekarang : "+arrList);
 }
}