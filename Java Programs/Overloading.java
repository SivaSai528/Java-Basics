class sai{

static int add (int a, int b)

{

return a+b;

}

static int add(int a,int b, int c)

{

return a+b+c;

}

}

class Overloading {

public static void main(String[] args) {

System.out.println(sai.add(12, 12));
System.out.println(sai.add(12, 12,12));
}
}