public class Parent1 {
  static int age;
   static int id;

  public Parent1(int age, int id) {
    this.age = age;
    this.id = id;
  }

  public static printout(){
    System.out.println("Age of the person "+Parent1.id+" is "+Parent1.age+"");
  }
}

public class Child {
  public static void main(String[] args) {
    Parent1 p1 = new Parent1(20, 20);
    p1.printout();
  }
}