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
    final static Double leftAngleA = (11.5*Math.PI) / 6;
    final static Double rightAngleA = Math.PI / 9;
    final static Double translationA = 24.0;
    final static Double widthAdjustment = 2.0;
    final static Double translationB = 37.0;
    final static Double adjustmentE = 20.0;
    final static Double translationN = 8.0;
    final static Double angleN = 10.0;
    final static Double adjustmentN = 15.0;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape letterA = new BaseShape();

        Rectangle left = new Rectangle(halfStripeThickness, maxHeight);
        left.rotate(left.getCoords(), leftAngleA);
        left.translate(left.getCoords(), new Point2d(translationA, 0.0));
        letterA.addAll(left.getCoords());

        Rectangle right = new Rectangle(halfStripeThickness, maxHeight);
        right.rotate(right.getCoords(), rightAngleA);
        right.translate(right.getCoords(), new Point2d(-translationA, 0.0));
        letterA.addAll(right.getCoords());

        Rectangle middle = new Rectangle(halfMaxWidth + halfStripeThickness, halfStripeThickness);
        letterA.addAll(middle.getCoords());

        return letterA;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape letterB = new BaseShape();

        Rectangle left = new Rectangle(stripeThickness, maxHeight);
        letterB.addAll(left.getCoords());

        Circle center = new Circle(maxWidth);

        Circle top = new Circle(maxWidth + stripeThickness);
        top.remove(center);
        top.translate(top.getCoords(), new Point2d(halfMaxWidth, -translationB));
        letterB.addAll(top.getCoords());

        Circle bottom = new Circle(maxWidth + stripeThickness);
        bottom.remove(center);
        bottom.translate(bottom.getCoords(), new Point2d(halfMaxWidth, translationB));
        letterB.addAll(bottom.getCoords());

        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape letterC = new BaseShape();

        Ellipse curve = new Ellipse(maxWidth + stripeThickness, maxHeight);
        Ellipse middle = new Ellipse(maxWidth + halfStripeThickness, maxHeight - halfStripeThickness);
        Rectangle side = new Rectangle(halfMaxWidth + stripeThickness, halfMaxHeight);
        side.translate(side.getCoords(), new Point2d(stripeThickness, 0.0));

        curve.remove(middle);
        curve.remove(side);

        letterC.addAll(curve.getCoords());

        return letterC;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape letterE = new BaseShape();

        Rectangle side = new Rectangle(stripeThickness, maxHeight - adjustmentE);
        letterE.addAll(side.getCoords());

        Rectangle top = new Rectangle(maxWidth, stripeThickness);
        top.translate(top.getCoords(), new Point2d(stripeThickness + widthAdjustment, -halfMaxHeight));
        letterE.addAll(top.getCoords());

        Rectangle middle = new Rectangle(maxWidth, stripeThickness);
        middle.translate(middle.getCoords(), new Point2d(stripeThickness + widthAdjustment, 0.0));
        letterE.addAll(middle.getCoords());

        Rectangle bottom = new Rectangle(maxWidth, stripeThickness);
        bottom.translate(bottom.getCoords(), new Point2d(stripeThickness + widthAdjustment, halfMaxHeight - adjustmentE));
        letterE.addAll(bottom.getCoords());

        return letterE;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape letterH = new BaseShape();

        Rectangle side = new Rectangle(stripeThickness, maxHeight);
        letterH.addAll(side.getCoords());

        Rectangle right = new Rectangle(stripeThickness, maxHeight);
        right.translate(right.getCoords(), new Point2d(maxWidth, 0.0));
        letterH.addAll(right.getCoords());

        Rectangle middle = new Rectangle(maxWidth, stripeThickness);
        middle.translate(middle.getCoords(), new Point2d(stripeThickness + widthAdjustment, 0.0));
        letterH.addAll(middle.getCoords());

        return letterH;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape letterN = new BaseShape();

        Rectangle left = new Rectangle(stripeThickness, maxHeight);
        letterN.addAll(left.getCoords());

        Rectangle right = new Rectangle(stripeThickness, maxHeight);
        right.translate(right.getCoords(), new Point2d(maxWidth + stripeThickness  + adjustmentN, 0.0));
        letterN.addAll(right.getCoords());

        Rectangle middle = new Rectangle(stripeThickness, maxHeight + adjustmentN);
        middle.rotate(middle.getCoords(), -angleN);
        middle.translate(middle.getCoords(), new Point2d(widthAdjustment * stripeThickness  + translationN, 0.0));
        letterN.addAll(middle.getCoords());

        return letterN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape letterO = new BaseShape();

        Ellipse contour = new Ellipse(maxWidth * widthAdjustment, maxHeight);
        Ellipse middle = new Ellipse(maxWidth * widthAdjustment - halfStripeThickness, maxHeight - halfStripeThickness);

        contour.remove(middle);

        letterO.addAll(contour.getCoords());

        return letterO;
    }

}
