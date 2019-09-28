import java.util.LinkedList;
import java.util.Scanner;
public class nomer1 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList();
        LinkedList<Integer> list2 = new LinkedList();
        Scanner in = new Scanner(System.in);
        System.out.println("Input Faktor Persekutuan 2 Bilangan");
        int angka1, angka2;
        System.out.print("Angka Pertama : ");
        angka1 = in.nextInt();
        System.out.print("Angka Kedua : ");
        angka2 = in.nextInt();
        int j = 0;
        System.out.print("Faktor dari " + angka1 + " = ");
        for (int i = 1; i <= angka1; i++) {
            if (angka1 % i == 0) {
                list1.add(i);
                System.out.print(list1.get(j) + " ");
                j++;
            }
        }
        System.out.println("");
        System.out.print("Faktor dari " + angka2 + " = ");
        j = 0;
        for (int i = 1; i <= angka2; i++) {
            if (angka2 % i == 0) {
                list2.add(i);
                System.out.print(list2.get(j) + " ");
                j++;
            }
        }
        System.out.println("");
        System.out.print("Faktor dari " + angka1 + " dan " + angka2 + " = ");
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                System.out.print(list1.get(i) + " ");
            }
        }
    }
}