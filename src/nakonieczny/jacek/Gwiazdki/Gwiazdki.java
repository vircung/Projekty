package nakonieczny.jacek.Gwiazdki;

/**
 * 
 * @author Jacek Nakonieczny
 */
public class Gwiazdki {

	public static void main(String[] args) {
		// System.out.print("Hello World\n");
		System.out.println();
		drawLine(20, 'x');

		System.out.println();
		drawLine2(10, '?');

		System.out.println();
		drawRectangle(5, 7, 'x');

		System.out.println();
		drawSquare(5, 'x');

		System.out.println();
		drawTriangleDown(5, 'x');

		System.out.println();
		drawTriangleUp(5, 'x');

		System.out.println();
		drawTrapezeDown(5, 5, 'x');

		System.out.println();
		drawTrapezeUp(10, 5, 'x');

		System.out.println();

	}

	private static void drawLine(int length, char c) {
		for (int i = 0; i < length; i++)
			System.out.print(c);
		System.out.println();
	}

	private static void drawLine2(int length, char c) {
		for (int i = 0; i < length; i++)
			System.out.print(c);
		System.out.println();
	}

	private static void drawRectangle(int height, int width, char c) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++)
				System.out.print(c);
			System.out.println();
		}
	}

	private static void drawSquare(int hw, char c) {
		for (int i = 0; i < hw; i++) {
			for (int j = 0; j < hw; j++)
				System.out.print(c);
			System.out.println();
		}
	}

	private static void drawTriangleDown(int ile, char c) {
		for (int i = 0; i < ile + 1; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(c);
			System.out.println();
		}
	}

	private static void drawTriangleUp(int ile, char c) {
		for (int i = ile; i > 0; i--) {
			for (int j = i; j > 0; j--)
				System.out.print(c);
			System.out.println();
		}
	}

	private static void drawTrapezeDown(int ile_ele, int w, char c) {
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < ile_ele; j++)
				System.out.print(c);
			System.out.println();
			ile_ele++;
		}
	}

	private static void drawTrapezeUp(int ile_ele, int w, char c) {
		for (int i = 0; i < w; i++) {
			for (int j = ile_ele; j > 0; j--)
				System.out.print(c);
			System.out.println();
			ile_ele--;
		}

	}
}