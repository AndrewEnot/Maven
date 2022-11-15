package mathutil;

/*
 * @author Oksiuta Andrii
 * 15.11.2022
 * 16:52
 */


public final class MathUtil {

  private MathUtil() {
  }

  public static double sin(double a) {
    return StrictMath.sin(a); // default impl. delegates to StrictMath
  }

  /**
   * Returns the trigonometric cosine of an angle. Special cases:
   * <ul><li>If the argument is NaN or an infinity, then the
   * result is NaN.
   * <li>If the argument is zero, then the result is {@code 1.0}.
   *</ul>
   *
   * <p>The computed result must be within 1 ulp of the exact result.
   * Results must be semi-monotonic.
   *
   * @param   a   an angle, in radians.
   * @return  the cosine of the argument.
   */

  public static double cos(double a) {
    return StrictMath.cos(a); // default impl. delegates to StrictMath
  }

  /**
   * Returns the trigonometric tangent of an angle.  Special cases:
   * <ul><li>If the argument is NaN or an infinity, then the result
   * is NaN.
   * <li>If the argument is zero, then the result is a zero with the
   * same sign as the argument.</ul>
   *
   * <p>The computed result must be within 1 ulp of the exact result.
   * Results must be semi-monotonic.
   *
   * @param   a   an angle, in radians.
   * @return  the tangent of the argument.
   */

  public static double tan(double a) {
    return StrictMath.tan(a); // default impl. delegates to StrictMath
  }

  /**
   * Returns the arc sine of a value; the returned angle is in the
   * range -<i>pi</i>/2 through <i>pi</i>/2.  Special cases:
   * <ul><li>If the argument is NaN or its absolute value is greater
   * than 1, then the result is NaN.
   * <li>If the argument is zero, then the result is a zero with the
   * same sign as the argument.</ul>
   *
   * <p>The computed result must be within 1 ulp of the exact result.
   * Results must be semi-monotonic.
   *
   * @param   a   the value whose arc sine is to be returned.
   * @return  the arc sine of the argument.
   */
  public static double asin(double a) {
    return StrictMath.asin(a); // default impl. delegates to StrictMath
  }

  /**
   * Returns the arc cosine of a value; the returned angle is in the
   * range 0.0 through <i>pi</i>.  Special case:
   * <ul><li>If the argument is NaN or its absolute value is greater
   * than 1, then the result is NaN.
   * <li>If the argument is {@code 1.0}, the result is positive zero.
   * </ul>
   *
   * <p>The computed result must be within 1 ulp of the exact result.
   * Results must be semi-monotonic.
   *
   * @param   a   the value whose arc cosine is to be returned.
   * @return  the arc cosine of the argument.
   */
  public static double acos(double a) {
    return StrictMath.acos(a); // default impl. delegates to StrictMath
  }

  /**
   * Returns the arc tangent of a value; the returned angle is in the
   * range -<i>pi</i>/2 through <i>pi</i>/2.  Special cases:
   * <ul><li>If the argument is NaN, then the result is NaN.
   * <li>If the argument is zero, then the result is a zero with the
   * same sign as the argument.
   * <li>If the argument is {@linkplain Double#isInfinite infinite},
   * then the result is the closest value to <i>pi</i>/2 with the
   * same sign as the input.
   * </ul>
   *
   * <p>The computed result must be within 1 ulp of the exact result.
   * Results must be semi-monotonic.
   *
   * @param   a   the value whose arc tangent is to be returned.
   * @return  the arc tangent of the argument.
   */


  public static double exp(double a) {
    return StrictMath.exp(a); // default impl. delegates to StrictMath
  }
}
