import java.util.*;
public class ArrayOfStack{
public static void main(String args[]){
ArrayList<Stack<Integer>> al = new ArrayList<Stack<Integer>>();
Stack<Integer> s1 = new Stack<Integer>();
s1.push(5);
s1.push(8);
s1.push(7);
s1.push(6);
Stack<Integer> s2 = new Stack<Integer>();
s2.push(5);
s2.push(8);
s2.push(7);
s2.push(6);
al.add(s1);
al.add(s2);
System.out.println(s1);
System.out.println(s2);
System.out.println(al.get(1).size());
}
}