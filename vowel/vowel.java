package vowel;

import java.util.Scanner;

public class vowel {
    public static void main(String args[]){
        String v[]={"a","e","i","o","u"};
        Scanner input = new Scanner(System.in);
        System.out.println("enter.:");
        String io=input.nextLine();
        int detect=0;
         int z=0;
         while(z<=4){
            if(io.equals(v[z])){
                detect =1;
            }
            z=z+1;
         }
         if(detect==1){
            System.out.println("vowels");
         }
         else{
            System.out.println("not");
         }
}
}