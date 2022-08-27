class Multithreading extends Thread {
  private int threadNumber;
   public Multithreading(int threadNumber){
    this.threadNumber = threadNumber;
  }
  public void run() {
    for (int i = 0; i <= 5; i++) {
      System.out.println(i+" from thread "+threadNumber);
      try{
        Thread.sleep(1000);
      }
      catch (InterruptedException e) {
        
      }
    }
  }
}
public class Multithreading2 {
  public static void main(String[] args) {
    for(int i = 0;i<5;i++){
      Multithreading myThing = new Multithreading(i);
      myThing.start();
    }
  }
}