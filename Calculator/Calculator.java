package Calculator;

import returnType.Return;

public class Calculator {
     int add(int x,int y){
        int z=x+y;
        return z;
    }
    int subtraction(int x,int y){
        int z=x-y;
        return z;
    }
    int multiply(int x,int y){
        int z=x*y;
        return z;
    }
    int divide(int x,int y){
        int z=x/y;
        return z;
    }
    public static void main(String args[]){
        Calculator obj=new Calculator();
        int a=obj.add(23,55);
        int b=obj.subtraction(234,34);
        int c=obj.multiply(50,4);
        double d=obj.divide(234,54);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    
}
