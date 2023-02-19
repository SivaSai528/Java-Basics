abstract class Shape   
{  
//abstract method  
//note that we have not implemented the functionality of the method  
public abstract void draw();  
}  
class Circle extends Shape  
{  
//implementing functionality of the abstract method  
public void draw()   
{  
System.out.println("Circle!");  
}  
}  
//main class   
public class Abstract   
{  
public static void main(String[] args)   
{  
Shape circle = new Circle();  
//invoking abstract method draw()  
circle.draw();  
}  
}