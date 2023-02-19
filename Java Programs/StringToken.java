import java.util.StringTokenizer;
public class StringToken{

    public static void main(String args[])
    {
        StringTokenizer Str= new StringTokenizer("Siva Sai"," ");
        while(Str.hasMoreTokens()){
            System.out.println(Str.nextToken());
        }
    }
}