import java.util.*;
public class nomer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        ArrayList<Integer> sama = new ArrayList();
        System.out.println("Input Faktor Persekutuan 2 Bilangan");
        System.out.print("Angka Pertama : ");
        int angka1 = input.nextInt();
        System.out.print("Angka Kedua : ");
        int angka2 = input.nextInt();
        for (int i = 1; i <=angka1; i++) if(angka1%i==0) list1.add(i);
        for (int i = 1; i <=angka2; i++) if(angka2%i==0) list2.add(i);
        for (int i =0;i<list1.size();i++) if(list2.contains(list1.get(i))) sama.add(list1.get(i));
        System.out.println("Faktor dari " + angka1 + " = "+list1);
        System.out.println("Faktor dari " + angka2 + " = "+list2);
        System.out.print("Faktor dari " + angka1 + " dan " + angka2 + " = "+sama);
    }
}
