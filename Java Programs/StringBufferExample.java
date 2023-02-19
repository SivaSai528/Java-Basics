class StringBufferExample
{
    public static void main(String arg[])
    {
        StringBuffer S=new StringBuffer("Siva ");
        System.out.println(S);// Siva 
        S.append("Sai");// Adding  to String S
        System.out.println(S);// Siva  Sai
        S.insert(0,"#");// Adding #in position 0
        System.out.println(S);// #Siva  Sai
        S.replace(0,4,"h");// elemets from index 0 to 4 deleted and replace with h
        System.out.println(S);// ha Sai
        S.delete(0, 3); //delete elements between o and 3 index
        System.out.println(S);//Sai
        S.reverse();// Reverse elements
        System.out.println(S);//iaS

    }
}