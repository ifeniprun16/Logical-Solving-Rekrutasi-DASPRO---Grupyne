import java.util.Scanner;
public class nomer5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("==== Speed Limit ====");
        System.out.print("Speed : ");
        float limit;
        int poin;
        limit=in.nextFloat();
        if(limit>70){
           poin = (int)(limit-70)/5;
           if(poin>=12){
            System.out.println("License Suspended");}
           else{
               System.out.printf("Point : %d",poin);  
           }          
        }else{
            System.out.print("OK");
        }
    }
}