public class Garbage{

public void finalize(){

System.out.println("object is garbage collected"); }

public static void main(String args[]) { 

Garbage s1=new Garbage();

Garbage s2= new Garbage();

s1=null;

s2=null;

System.gc();

}

}