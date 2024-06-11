import static java.lang.Math.sqrt;

public class Point {
	// Create a point from its coordinates
	public Point(double xVal, double yVal) {
		x = xVal;
		y = yVal;
	}

	// Create a point from an existing Point object
	public Point(final Point aPoint) {
		x = aPoint.x;
		y = aPoint.y;
	}

	// Move a point
	public void move(double xDelta, double yDelta) {
		// Parameter values are increments to the current coordinates
		x += xDelta;
		y += yDelta;
	}

	// Calculate the distance to another point
	public double distance(final Point aPoint) {
		return sqrt((x - aPoint.x) * (x - aPoint.x) + (y - aPoint.y) * (y - aPoint.y));
	}

	// Convert a point to a string
	public String toString() {
		return Double.toString(x) + ", " + y;
	}

	// Coordinates of the point
	private double x;
	private double y;
}
