package fr.uxfuncraft.calculator.operations;

public class BaseOperations {
	/**
	 * Adding par2Term to par1Term.
	 * @param par1Term - The first addition's term.
	 * @param par2Term - The second addition's term.
	 * @return par1Term + par2Term.
	 */
	public static double addition(double par1Term, double par2Term) {
		return par1Term + par2Term;
	}
	
	/**
	 * Subtract par2Term to par1Term.
	 * @param par1Term - The first subtraction's term.
	 * @param par2Term - The second subtraction's term.
	 * @return par1Term - par2Term.
	 */
	public static double subtraction(double par1Term, double par2Term) {
		return par1Term - par2Term;
	}
	
	/**
	 * Multiply par1Factor by par2Factor.
	 * @param par1Factor - The first multiplication's factor.
	 * @param par2Factor - The second multiplication's factor.
	 * @return par1Factor * par2Factor.
	 */
	public static double multiplication(double par1Factor, double par2Factor) {
		return par1Factor * par2Factor;
	}
	
	/**
	 * Divide par1Dividend by par2Divisor.
	 * @param par1Dividend - The division's dividend.
	 * @param par2Divisor - The division's divisor. Must be different of 0 !
	 * @return If par2Divisor != 0, return par1Dividend / par2Divisor. Otherwise, return Double.POSITIVE_INFINITY.
	 */
	public static double division(double par1Dividend, double par2Divisor) {
		try {
			return par1Dividend / par2Divisor;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			return Double.POSITIVE_INFINITY;
		}
	}
	
	/**
	 * Get rest of the division of par1Dividend by par2Divisor.
	 * @param par1Dividend - The division's dividend.
	 * @param par2Divisor - The division's divisor. Must be different of 0 !
	 * @return If par2Divisor != 0, return par1Dividend % par2Divisor. Otherwise, return Double.POSITIVE_INFINITY.
	 */
	public static double modulo(double par1Dividend, double par2Divisor) {
		try {
			return par1Dividend % par2Divisor;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			return Double.POSITIVE_INFINITY;
		}
	}
}
