package mathutil;

/*
 * @author Oksiuta Andrii
 * 15.11.2022
 * 16:52
 */


public final class MathUtil {

  private MathUtil() {
  }

  /**
   * This method sums two numbers
   */
  public static double sum(double a, double b) {
    return a + b;
  }

  /**
   * This method pows
   */
  public static double pow(double a, double b) {
    return Math.pow(a, b);
  }

  /**
   * This method multiplicates two numbers
   */
  public static double multiplication(double a, double b) {
    return a * b;
  }
}
