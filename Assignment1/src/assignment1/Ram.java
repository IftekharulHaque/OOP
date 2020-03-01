
package objectpass;

public class Ram {
   int size=16;
   String brand="Corsair";
   public Ram(){
   System.out.println("Size= "+size+", Brand = "+brand);
   }
   
   public Ram(int size,String brand){
       this.size=size;
       this.brand=brand;
       System.out.println("Size= "+this.size+", Brand = "+this.brand);
   }
   
   
  public Ram(Ram Display){
      this.size=Display.size;
      this.brand=Display.brand;
      System.out.println("Size= "+this.size+", Brand = "+this.brand);
  }
}
