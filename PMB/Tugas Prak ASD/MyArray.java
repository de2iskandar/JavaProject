import java.util.ArrayList;

public class MyArray {
 public static void main(String[] args) { 
  //buat ArrayList
  ArrayList<String> arrList = new ArrayList<String>();
  for (int i=1;i<=50;i++){
	arrList.add(i + " ");
  }
  //tampilkan ArrayList
  System.out.println("Ukuran ArrayList : "+arrList.size());
  System.out.println("Isi ArrayList : "+arrList);
 }
}