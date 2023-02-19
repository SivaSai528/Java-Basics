interface Printable//Defining base interface
    {
    void paint();
    }

interface Showable//define the derived interface
    {
    void show();
     }


class Multipleinterface implements Printable,Showable
    {
   public void paint()//Expanding the interface
   {
   System.out.println("Welcome");
   }
   public void show()//Expanding the interface method show
   {
  System.out.println("Java lab");
   }
  public static void main(String args[])
  {
  Multipleinterface mi=new Multipleinterface();
  mi.paint();
  mi.show();
  }
  }
