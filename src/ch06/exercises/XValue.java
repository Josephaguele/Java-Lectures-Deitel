package ch06.exercises;

/** What is the value of X after each of the following statements is executed?
 * Fig. 6.7
 */
public class XValue {
    public static void main (String[]args)
    {
        System.out.println("Math.abs(7.5) = " + Math.abs(7.5));
        System.out.println("Math.floor(7.5)= " + Math.floor(7.5));
        System.out.println("Math.abs(0.0) = " + Math.abs(0.0));
        System.out.println("Math.ceil(-6.4) = " + Math.abs(-6.4));
        System.out.println("-Math.abs(- 8 + Math.floor(-5.5) =" + -Math.abs(-8 + Math.floor(-5.5)));
    }
}
