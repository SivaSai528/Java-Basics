import java.io.FileInputStream;  
public class DataStream//its a classname 
     {  
     public static void main(String args[])//main method
         {    
          try{    
    FileInputStream fin=new FileInputStream("A:\\Sai.txt");//read Sai.txt    
            int i=fin.read();//read contents on Sai.txt  
            System.out.print((char)i);//print individual character    
            fin.close();    
          }catch(Exception e)
        {
        System.out.println(e);
  
 }    
         }    
        }  