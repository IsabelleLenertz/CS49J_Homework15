import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;

public class RectangleSorter {
	public static void sortByArea(ArrayList<Rectangle> list) {
		Collections.sort(list, (r1, r2) -> 
			(int)(r1.getHeight()*r2.getWidth() - r2.getHeight()*r2.getWidth())
		);
	}
	
	public static void sortByDescendingPerimeter (ArrayList<Rectangle> list) {
		Collections.sort(list, (r1, r2)-> 
			(int)((r1.getHeight() + r1.getWidth()) - (r2.getHeight() + r2.getWidth()))
		);
	}
}
