package returnType;

public class Return {
    public int add(int x,int y){
        int z=x+y;
        return z;
    }
    public static void main(String args[]){
        Return obj=new Return();
        int a=obj.add(23,55);
        System.out.println(a);
    }
    
}
