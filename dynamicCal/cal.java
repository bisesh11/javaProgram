package dynamicCal;

import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("enter any no.: " );
        int no= o.nextInt();
        Scanner w=new Scanner(System.in);
        System.out.println("enter any no.: " );
        int bn= w.nextInt();

        System.out.println("option\n1\n2\n3\n4\n");
        Scanner input=new Scanner(System.in);
        System.out.println("enter option: " );
        int j= input.nextInt();
        if(j==1){
            int z=no+bn;
        System.out.println("add: "+z);
        }
        else if(j==2){
            int z=no-bn;
        System.out.println("sub: "+z);
        }
        else if(j==3){
            int z=no*bn;
        System.out.println("multiply: "+z);
        }
        if(j==4){
            int z=no/bn;
        System.out.println("divide: "+z);
        }
    }
}
