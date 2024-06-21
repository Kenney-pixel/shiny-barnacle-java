ph.cloudberry.geometry

public class Line {
	public Line(final Point start, final Point end) {
		this.start = new Point(start);
		this.end = new Point(end);
	}

	// Create a line from two coordinate pairs
	public Line(double xStart, double yStart, double xEnd, double yEnd) {
		start = new Point(xStart, yStart);
		end = new Point(xEnd, yEnd);
	}

	// Calculate the length of a line
	public double length() {
		return start.distance(end);
	}

	// Return a point as the intersection of two lines -- called from a Line object
	public Point intersects(final Line line1) {
		Point localPoint = new Point(0,0);


