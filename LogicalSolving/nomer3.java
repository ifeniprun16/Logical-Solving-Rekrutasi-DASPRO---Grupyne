import java.util.Scanner;
public class nomer3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Persamaan : ");
            String inputan = (input.nextLine()).toLowerCase();
            String[] arrinput = inputan.split("x");
            String[] arrinput2 = arrinput[1].split("=");
            int a, b, c, x;
            if (arrinput[0].isEmpty()) {
                a = 1;
            } else if (arrinput[0].equals("-")) {
                a = -1;
            } else {
                a = Integer.valueOf(arrinput[0]);
            }
            System.out.println("a = " + a);
            if (arrinput2[0].isEmpty()) {
                b = 0;
            } else {
                b = Integer.valueOf(arrinput2[0]);
            }
            System.out.println("b = " + b);
            c = Integer.valueOf(arrinput2[1]);
            System.out.println("c = " + c);
            if ((c - b) % a == 0) {
                x = (c - b) / a;
                System.out.println("x = " + x);
            } else {
                if (a < 0 && c - b < 0) {
                    System.out.println("x = " + (b-c) + "/" + (a*-1));
                } else {
                    System.out.println("x = " + (c - b) + "/" + (a));
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Format Penulisan Salah");
        }
    }
}