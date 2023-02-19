import java.io.*;  
public class FileDemo {  
    public static void main(String[] args) {  
         try {  
            File file = new File("C:\\Users\\Siva Sai\\Desktop\\Java Programs\\Stream\\Sss.txt");  
            if (file.createNewFile()) 
              {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}