import java.util.*;
public class TreeSetDemo{
	public static void main(String args[]){	
		String str = "the quick fox jumps over quickly";
		String[] phraseList = str.split(" ");
		TreeSet<String> words = new TreeSet<String>();
		words.addAll(Arrays.asList(phraseList));
		for(String w: words){
			System.out.println(w);
		}
	}
}