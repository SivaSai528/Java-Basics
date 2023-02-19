import java.io.*;  
public class BufferedWriterExample {  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("E:\\Siva.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to java LAB");  
    buffer.close();  
    System.out.println("Success");  
    }  
}