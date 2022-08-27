interface AnimalInterface {
  String color = "Brown";

  void eat();

  void excrete();
}


public class InterfaceAndAbstract implements AnimalInterface {
  public void eat() {
    System.out.println("Animal ate grass");
  }

  public void excrete() {
    System.out.println("Animal excreted on soil");
  }
  public static void main(String[] args) {
    System.out.println(color);
    InterfaceAndAbstract iabs = new InterfaceAndAbstract();
    iabs.eat();
    iabs.excrete();
  }
}
