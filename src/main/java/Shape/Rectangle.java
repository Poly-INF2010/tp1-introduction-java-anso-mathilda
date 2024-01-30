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
        super();
        double newWidth = (width/2);
        double newHeight = (height/2);
            for(double i = -newWidth ; i <= newWidth ; i += 0.5){
                for(double j = -newHeight ; j <= newHeight ; j += 0.5){
                    this.add(new Point2d(i, j));
                }
            }
    }


    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        super();
        double newWidth = (dimensions.X()/2);
        double newHeight = (dimensions.Y()/2);
        for(double i = -newWidth ; i <= dimensions.X() ; i += 0.5){
            for(double j = -newHeight ; j <= dimensions.Y() ; j += 0.5){
                this.add(new Point2d(i, j));
            }
        }
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(cloneCoords(this.getCoords()));
    }
}
