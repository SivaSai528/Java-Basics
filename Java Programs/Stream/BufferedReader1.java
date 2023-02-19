import java.io.*;  
public class BufferedReader1 {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("E:\\Siva.txt");    
          BufferedReader br=new BufferedReader(fr);    
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          br.close();    
          fr.close();    
    }    
}