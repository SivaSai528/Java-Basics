class Student4 {

    int id;
    
    String name;

    static String college=("Sai");
    
    //creating a parameterized constructor
    
    Student4(int i,String n) {
    
    id = i;
    
    name = n;
    
    }
    
    void display() { System.out.println(id+" "+name); }
    
    public static void main(String args[]){ //creating objects and //passing values
    
    Student4 s1 = new Student4(1,"M.Rithvik");
    
    Student4 s2 =new Student4(2, "D.Jagadeesh");
    
    //calling method to display the values of object
    
    s1.display();
    
    s2.display();
    }
    }