
import java.io.*;  
public class BufferedReader3{    
public static void main(String args[])throws Exception{             
InputStreamReader r=new InputStreamReader(System.in);//it is going to read the input from java.io.* package    
     BufferedReader br=new BufferedReader(r);//get convert in the form of buffers           
     String name="";//define name    
     while(!name.equals("stop"))//name is not eaual to stop
     {    
      System.out.println("Enter data: ");    
      
name=br.readLine();//br it is going to consists of the input stream data    
      System.out.println("data is: "+name);    
     }              
    br.close();    
    r.close();    
    }    
    } 