import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi;
        int toplam=0;
        int miktar=-1;
        System.out.println("Sayi giriniz:");
        sayi= scanner.nextInt();
        for(int i=0;i<=sayi;i++){
            if(i%4==0 && i%3==0){
                toplam+=i;
                miktar+=1;
            }

        }
        System.out.println("Ortalama="+(toplam/miktar));
    }
}