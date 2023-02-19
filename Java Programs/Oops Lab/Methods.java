class Methods {
 
  public void Race() {
    System.out.println("Student is Running ");
  }
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
public static void main(String[] args) {
    Methods Student = new Methods();   // Create a myCar object
    Student.Race();      // Call the Race() method
    Student.speed(20);          // Call the speed() method
  }
}