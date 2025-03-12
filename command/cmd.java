package command;
public class cmd {
    /*
     1 cmd file
     2 using variable 
      
     */
    public void add(int x,int y) {
        int z=x+y;
        System.out.println(z);
    }
    public static void main(String[] args) {
        cmd obj=new cmd();
        obj.add(10,20);
    }
}
