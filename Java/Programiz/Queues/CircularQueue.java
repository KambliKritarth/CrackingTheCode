import java.util.*;
public class CircularQueue{
    int SIZE,front,rear;
    int items[];
    CircularQueue(int size){
        front = -1;
        rear = -1;
        items = new int[size];
    }
    boolean isFull(){
        if(front == 0 && rear == SIZE - 1){
            return true;
        }
        if(front == rear+1){
            return true;
        }
        return false;
    }
    boolean isEmpty(){
        if(front==-1 ){
            return true;
        }
        return false;
    }
    void Enqueue(int element){
        if(isFull()){
            System.out.println("The queue is full");
        }
        else{
            if(front == -1)
                front = 0;
            rear = (rear+1)%SIZE;
            items[rear] = element;
            System.out.println("Element "+element+" added at "+rear+".");
        }
    }
    int dequeue(){
        int val;
        if(isEmpty()){
            System.out.println("Queue is empty");
            return (-1);
        }
        else{
            val = items[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else{
                front = (front +1)%SIZE;
            }
            return val;
        }
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int size = sc.nextInt();
        CircularQueue cq = new CircularQueue(size);
        sc.close();
    }
}