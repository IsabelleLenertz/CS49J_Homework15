import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Sort rectangles
 * @author isabelle delmas
 *
 */
public class RectangleSorter {
	/**
	 * Sort rectangles by their area (small area first)
	 * @param list list of rectangles
	 */
	public static void sortByArea(ArrayList<Rectangle> list) {
		Collections.sort(list, (r1, r2) -> 
			(int)(r1.getHeight()*r2.getWidth() - r2.getHeight()*r2.getWidth())
		);
	}
	
	/**
	 * Sort rectangles by their perimeter (large perimeter first)
	 * @param list list of rectangles
	 */
	public static void sortByDescendingPerimeter (ArrayList<Rectangle> list) {
		Collections.sort(list, (r2, r1)-> 
			(int)((r1.getHeight() + r1.getWidth()) - (r2.getHeight() + r2.getWidth()))
		);
	}
}
