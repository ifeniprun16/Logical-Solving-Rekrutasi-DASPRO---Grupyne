import java.util.Scanner;
public class nomer4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total data : ");
        int angka, batas = input.nextInt();
        int arr[] = new int[3];
        System.out.println();
        for (int i = 0; i < batas; i++) {
            System.out.print("Angka ke-"+(i+1)+" : ");
            angka=input.nextInt();
            if(angka>arr[0]){
                arr[1]=arr[0];
                arr[0]=angka;
            }else if(angka>=arr[1]&&angka<arr[0]){
                arr[2]=arr[1];
                arr[1]=angka;
            }
        }
        System.out.print("\nBest Second : "+arr[1]);
    }
}