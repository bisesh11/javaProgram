package sumOfDigit;
import java.util.*;
public class digit{   //sum of digit
    public static void  main(String args[]){
        Scanner Scan=new Scanner(System.in);
        System.out.println("enter no.: ");
        int n=Scan.nextInt();
        int sum=0;
        while(n>0){
        sum +=n %10;
        n/=10; 
    }
    System.out.println("total sum : " +sum );
}
}
