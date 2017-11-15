import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class LinkedListUtil {
	/**
	 * Remove every nth node in the LinkedList of Strings. Start the removal with the nth not the 0th node
	 * @param strings list of strings
	 * @param n positions to remove
	 */
	public static void shrink(LinkedList<String> strings, int n) {
		
		for(int i =1; i < strings.size(); i++) {
			if(i%n == 0) {
				strings.remove(i);
			}
		}
	}
	public static LinkedList<String> reverse(LinkedList<String> strings) {
		LinkedList<String> reversedList = new LinkedList<>();
		Stack<String> stack = new Stack<>();
		ListIterator<String> it = strings.listIterator();
		
		while(it.hasNext()) {
			
		}
		
		return reversedList;
	}
}
