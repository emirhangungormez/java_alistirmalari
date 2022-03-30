import java.util.Scanner;

public class girilen_saylarin_ortalamasini_bulma {

  // ortalama hesaplayan fonksiyon.
  public static void ortalamaBulma(int[] arr) {
    int total = 0;

    for (int i = 0; i < arr.length; i++){
      total += arr[i];
    }
    System.out.println("Ortalama: " + (double)total / arr.length);

  }
    public static void main(String[] args){

      System.out.println("Dizi elemanlarını giriniz: ");

      Scanner scanner = new Scanner(System.in);

      int[] arr2 = new int[5];

      for(int i = 0; i < arr2.length; i++){
        arr2[i] = scanner.nextInt();
      }

     ortalamaBulma(arr2);
     }
}
