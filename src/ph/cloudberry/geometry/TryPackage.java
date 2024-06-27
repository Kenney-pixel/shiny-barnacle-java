import ph.cloudberry.geometry.*;

public class TryPackage {
	public static void main(String[] args) {
		double [][] coords = { {1.0, 0.0}, {6.0, 0.0}, {6.0, 10.0},
			{10.0, 10.0}, {10.0, -14.0}, {8.0, -14.0}};

		// Create an array of points and fill it with Point objects
		Point[] points = new Point[coords.length];
		for(int i=0; i<coords.length; i++)
			points[i] = new Point(coords[i][0], coords[i][1]);

		// Create an array of lines and gill it using Points pairs
