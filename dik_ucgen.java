import java.util.Scanner;
 
public class dik_ucgen {
  public static void main (String [] args) {

  Scanner klavye = new Scanner(System.in);
  System.out.print("Bir sayı giriniz");
  int sayi = klavye.nextInt();

  if (sayi>=1){
    for (int i=0;i<sayi;i++) {
      for(int j=0;j<=i;j++){
        System.out.print (" * ");
      }
    System.out.println();
   }
  }
  }
}
  

