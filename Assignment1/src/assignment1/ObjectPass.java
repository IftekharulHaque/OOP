
package objectpass;


public class ObjectPass {
    public static void main(String[] args){
           
            System.out.println("Way 1:");
            Ram ram_1=new Ram();
            
            System.out.println("Way 2:");
            Ram ram_2=new Ram(16,"corsair");
            
            System.out.println("Way 3:");
            Ram ram_3=new Ram(ram_1);
            
           
            
    
}
