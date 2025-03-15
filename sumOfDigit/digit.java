package sumOfDigit;
import java.util.*;
public class digit{
    public static void  main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter no.: ");
        int n=obj.nextInt();
       
        int sum=0;
        for(int i=1;i<=n;i++){
        sum +=i;
    }
    System.out.println("total sum of no. from 1 to  "+n+"is: " +sum );
    obj.close();
}
}
