package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape letterA = new BaseShape();

        Rectangle left = new Rectangle(halfStripeThickness, maxHeight);
        left.rotate(left.getCoords(), (11.5*Math.PI) / 6);
        left.translate(left.getCoords(), new Point2d(30.0, 0.0));
        letterA.addAll(left.getCoords());

        Rectangle right = new Rectangle(halfStripeThickness, maxHeight);
        right.rotate(right.getCoords(), Math.PI / 9);
        right.translate(right.getCoords(), new Point2d(-30.0, 0.0));
        letterA.addAll(right.getCoords());

        Rectangle middle = new Rectangle(halfMaxWidth + 10, halfStripeThickness);
        middle.translate(middle.getCoords(), new Point2d(0.0, -2.0));
        letterA.addAll(middle.getCoords());

        return letterA;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        return null;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        return null;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        return null;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        return null;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        return null;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        return null;
    }

}
