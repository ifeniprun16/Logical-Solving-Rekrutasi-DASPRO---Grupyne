import java.util.Scanner;
public class nomer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Ukuran : ");
        int batas = input.nextInt();
        String isii[] = new String[batas];
        String spasi[] = new String[batas];
        System.out.print("Masukkan Isi Jam Pasir : ");
        String isi = input.next();
        input.nextLine();
        int anu = (batas * 2) - 2, anu2 = 1;
        for (int i = 0; i < batas; i++) {
            isii[i] = "";
            spasi[i] = "";
            for (int j = 0; j < i; j++) {
                spasi[i] = spasi[i] + " ";
            }
            for (int j = 0; j < anu; j++) {
                isii[i] = isii[i] + isi;
            }
            anu -= 2;
        }
        for (int i = 0; i < batas * 2; i++) {
            System.out.print("|");
            if (i < batas) {
                System.out.print(spasi[i]);
                System.out.print("\\");
                System.out.print(isii[i]);
                System.out.print("/");
                System.out.print(spasi[i]);
            } else {
                System.out.print(spasi[i - anu2]);
                System.out.print("/");
                System.out.print(isii[i - anu2]);
                System.out.print("\\");
                System.out.print(spasi[i - anu2]);
                anu2 += 2;
            }
            System.out.println("|");
        }
    }
}