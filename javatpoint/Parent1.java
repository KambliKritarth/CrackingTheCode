public class Parent1 {
  public static int age;
  private static int id;

  public Parent1(int age, int id) {
    this.age = age;
    this.id = id;
  }

  public static void printout() {
    System.out.println("Age of the person " + Parent1.id + " is " + Parent1.age + "");
  }
  public static void main(String[] args) {
    System.out.println("Parent1 class");
  }
}
