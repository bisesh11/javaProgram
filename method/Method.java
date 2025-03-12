package method;
public class Method {
     public static void add(int x,int y) {
        int z=x+y; 
        System.out.println("Addition: "+z);
    }
    public void main(String args []){
        Method obj=new Method();
        obj.add(12,34);

    }
}

