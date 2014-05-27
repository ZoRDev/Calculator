package fr.uxfuncraft.calculator.operations;

import fr.uxfuncraft.calculator.configuration.Operation;

public class GetRequestOperation {
	/**
	 * It's the requested operation's result.
	 */
	private static double result;
	
	/**
	 * Get which operation is the request.
	 * @param par1 - The first number of the operation.
	 * @param par2 - The second number of the operation.
	 * @param par3Operation - The operation.
	 */
	GetRequestOperation(double par1, double par2, Operation par3Operation) {
		if (par3Operation.equals(Operation.Addition)) {
			result = BaseOperations.addition(par1, par2);
		} else if (par3Operation.equals(Operation.Subtraction)) {
			result = BaseOperations.subtraction(par1, par2);
		} else if (par3Operation.equals(Operation.Multiplication)) {
			result = BaseOperations.multiplication(par1, par2);
		} else if (par3Operation.equals(Operation.Division)) {
			result = BaseOperations.division(par1, par2);
		} else if (par3Operation.equals(Operation.Modulo)) {
			result = BaseOperations.modulo(par1, par2);
		}
	}
	
	/**
	 * Get the requested operation's result.
	 * @return The requested operation's result.
	 */
	public static double getResult() {
		return result;
	}
}

	