package Point;

public class Point2d extends AbstractPoint {
    private final Integer X = 0;
    private final Integer Y = 1;

    /** TODO
     * 2D Point Constructor from coordinates
     * @param x X coordinate
     * @param y Y coordinate
     */

    public Point2d(Double x, Double y) {
        super(new double[] {x, y});
    }

    /** TODO
     * 2D Point Constructor from vector
     * @param vector Vector containing X and Y coordinates
     */
    public Point2d(Double[] vector) {
        this(vector[0], vector[1]);
    }

    /**
     * @return X coordinate
     */
    public double X() { return vector[X];}

    /**
     * @return Y coordinate
     */
    public double Y() { return vector[Y];}

    /** TODO
     * Translate the point by the given vector
     * @param translateVector The vector by which to translate
     * @return Translated point
     */
    @Override
    public Point2d translate(Double[] translateVector) {
        vector[X] += translateVector[0];
        vector[Y] += translateVector[1];
        return this;
    }

    /** TODO
     * Translate the point by the given 2D Point
     * @param translateVector The 2D Point by which to translate
     * @return Translated point
     */
    public Point2d translate(Point2d translateVector) {
        vector[X] += translateVector.vector[0];
        vector[Y] += translateVector.vector[1];
        return this;
    }

    /** TODO
     * Rotate the point by the given rotation Matrix
     * @param rotationMatrix Matrix by which to rotate
     * @return Rotated point
     */
    @Override
    public Point2d rotate(Double[][] rotationMatrix) {
        vector[X] = vector[X] * rotationMatrix[0][0] + vector[Y] * rotationMatrix[0][1];;
        vector[Y] = vector[X] * rotationMatrix[1][0] + vector[Y] * rotationMatrix[1][1];
        return this;
    }

    /** TODO
     * Rotate the point by the given angle
     * @param angle Angle in radians
     * @return Rotated point
     */
    public Point2d rotate(Double angle) {
        double x = (vector[X] * Math.cos(angle)) - (vector[Y] * Math.sin(angle));
        double y = (vector[X] * Math.sin(angle)) + (vector[Y] * Math.cos(angle));
        vector[X] = x;
        vector[Y] = y;
        return this;
    }

    /** TODO
     * Divide the X and Y coordinates of a 2D point by a scalar
     * @param divider Scalar used to divide
     * @return Divided point
     */
    @Override
    public Point2d divide(Double divider) {
        vector[X] /= divider;
        vector[Y] /= divider;
        return this;
    }

    /** TODO
     * Multiply the X and Y coordinates of a 2D point by a scalar
     * @param multiplier Scalar used to multiply
     * @return Multiplied point
     */
    @Override
    public Point2d multiply(Double multiplier) {
        vector[X] *= multiplier;
        vector[Y] *= multiplier;
        return this;
    }

    /** TODO
     * Add a scalar to the X and Y coordinates of a 2D point
     * @param adder Scalar to add
     * @return Added point
     */
    @Override
    public Point2d add(Double adder) {
        vector[X] += adder;
        vector[Y] += adder;
        return this;
    }

    /** TODO
     * @return Deep copy of the 2D point
     */
    @Override
    public Point2d clone() {
        return new Point2d(vector[X], vector[Y]);
    }
}
