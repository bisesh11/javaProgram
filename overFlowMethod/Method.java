package overFlowMethod;
import java.util.*;
public class Method {
    void add(int a,int b){
        System.out.println("answer: "+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("answer: "+(a+b+c));
    }
    public static void main(String args[]){
        Method obj=new Method();
        obj.add(12,34);
        obj.add(34,56,24);
    }
}
