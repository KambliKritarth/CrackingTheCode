abstract class Dog {
  String breed;

  public void bark() {
    System.out.println("Bark!");
  }
}

class Chihuahua extends Dog {
  
}

public class AbstractClass {
  public static void main(String[] args) {
    Chihuahua d = new Chihuahua();
    d.bark(); 
  }
}
