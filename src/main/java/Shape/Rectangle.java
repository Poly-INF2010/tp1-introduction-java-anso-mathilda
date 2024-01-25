package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        Point2d point1 = new Point2d((width/2), (height/2));
        Point2d point2 = new Point2d(-(width/2), (height/2));
        Point2d point3 = new Point2d((width/2), -(height/2));
        Point2d point4 = new Point2d(-(width/2), -(height/2));
        ArrayList<Point2d>points = new ArrayList<>(Arrays.asList(point1, point2, point3, point4));
        BaseShape rectangle = new BaseShape(points);
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {

    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {

    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return null;
    }
}
