public class StringOperation
{
    public static void main(String arg[])
    {
        String S=" Siva Sai ";
        System.out.println(S);
        System.out.println(S.trim());//<string_name.trim()> Trim used to clear white space at begining 
        System.out.println(S.toUpperCase());
        System.out.println(S.toLowerCase());
        System.out.println(S.startsWith("siv"));// string starts with Siv then display true
        System.out.println(S.startsWith(" Siv"));// in our string start with white space so here i give white space so answer is True
        System.out.println(S.endsWith("Sai"));// false
        System.out.println(S.endsWith("Sai "));// true
        System.out.println(S.charAt(2));// Display index value = S is in index 1
        //System.out.println(S.charAt(13));//  out of range
        System.out.println(S.length());// length of string is display
        
        
        
        String S2=S.intern();// Copy the string
        System.out.println(S2);// Siva Sai



        int dd=999;


        String SS=String.valueOf(dd);// Collecting data
        System.out.println(SS);//999


        System.out.println(SS+369);//999369
        System.out.println(S.replace("S","$"));//replace the s with $


    }
}