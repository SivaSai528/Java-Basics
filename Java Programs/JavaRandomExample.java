import java.util.Random;
public class JavaRandomEaxmple{
    public static void main(String[] args){
Random random= new Random();
boolean val= random.nextBoolean();
System.out.println("Randowm Bollean Value;"+val);
byte[] bytes= new byte[10];
random.nextBytes(bytes);
System.out.println("Random Bytes=(");
for (int i=0; i<bytes.length; i++)
{
    System.out.println("%d",bytes[i]);
}
System.out.println(")");
}
}