interface Printable//Defining base interface
    {
    void print();
    }
interface Showable extends Printable//derived class interface
    {
    void show();
   }

class Interfaceinheritance implements Showable
   {
   public void print()
  {
  System.out.println("Starting the LAB Programs");
  }
public void show()
 {
 System.out.println("1st lab program");
}

public static void main(String arg[]){
 Interfaceinheritance i=new Interfaceinheritance();//Declaring the object
 i.print();
 i.show();
}
}