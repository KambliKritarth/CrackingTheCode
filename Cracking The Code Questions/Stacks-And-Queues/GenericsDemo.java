public class GenericsDemo {
  public static void main(String[] args) {
    Generics<Integer> iObj = new Generics<Integer>(15);
    System.out.println(iObj.getObject());
    Generics<String> sObj = new Generics<String>("Fifteen");
    System.out.println(sObj.getObject());
  }
}
class Generics<T> {
  T obj;
  public Generics(T obj){
    this.obj = obj;
  }

  public T getObject() {
    return this.obj;
  }
}
