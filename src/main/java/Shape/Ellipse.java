package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        super();
        fillEllipse(widthDiameter, heightDiameter);
      }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        super();
        fillEllipse(dimensions.X(), dimensions.Y());
    }

    private void fillEllipse(Double widthDiameter, Double heightDiameter){
        double horizontalRadius = widthDiameter / 2;
        double verticalRadius = heightDiameter / 2;
        double leftFocus = - (Math.sqrt(horizontalRadius * horizontalRadius + verticalRadius * verticalRadius)) / 2;
        double rightFocus = (Math.sqrt(horizontalRadius * horizontalRadius + verticalRadius * verticalRadius)) / 2;
        for(double i = -horizontalRadius ; i <= horizontalRadius ; i += 0.5){
            double height = Math.sqrt((1 - (Math.pow(i, 2) / Math.pow(horizontalRadius, 2))) * Math.pow(verticalRadius, 2));
            for(double j = -height ; j <= height ; j += 0.5){
                this.add(new Point2d(i, j));
            }
        }
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(super.cloneCoords(getCoords()));
    }
}
