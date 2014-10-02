public class Descending {
 
        public static void main(String[] args) {
                System.out.println("____________________________________\nOleh\t: DEDE ISKANDAR, 1127050031\n====================================\n");              
                int intArray[] = new int[]{21, 83, 42, 11, 10, 9, 3, 20, 102, 27, 15, 92, 2};
              
                System.out.println("Sebelum diurutkan");
                for(int i=0; i < intArray.length; i++){
                        System.out.print(intArray[i] + " ");
                }
               
                bubbleSort(intArray);
               
                System.out.println("");
               
                System.out.println("Setelah diurutkan Bubble Sort Descending");
                for(int i=0; i < intArray.length; i++){
                        System.out.print(intArray[i] + " ");
                }
 
        }
 
        private static void bubbleSort(int[] intArray) {
                             
                int n = intArray.length;
                int temp = 0;
               
                for(int i=0; i < n; i++){
                        for(int j=1; j < (n-i); j++){
                               
                                if(intArray[j-1] < intArray[j]){
                                        //swap the elements!
                                        temp = intArray[j-1];
                                        intArray[j-1] = intArray[j];
                                        intArray[j] = temp;
                                }
                               
                        }
                }
       
        }
}
