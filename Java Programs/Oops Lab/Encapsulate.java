import java.util.Scanner;  
class Person {
    private int age;
    public int getAge() {
      return age;
    }
    public void setAge(int age) {
      this.age = age;
    }
  }
  
  class Encapsulate {
    public static void main(String[] args) {
        int age2;   
        Scanner sc= new Scanner(System.in);  
        System.out.print("Enter the age: ");  
        age2=sc.nextInt();
        Person p1 = new Person();
        p1.setAge(age2);
        System.out.println("My age is " + p1.getAge());
    }
  }