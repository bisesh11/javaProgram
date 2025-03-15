package N_number;

import java.util.Scanner;

public class num {
    public static void main(String args[]){
        Scanner i = new Scanner(System.in);
        System.out.println("enter any no.:");
        int in=i.nextInt();
        Scanner j = new Scanner(System.in);
        System.out.println("enter last no.:");
        int jn=j.nextInt();
        while(in<=jn){
        System.out.println("no: " +in);
            in++;
        }
    }
}
