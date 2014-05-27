package fr.uxfuncraft.calculator.configuration;

public enum TypeResult {
	/**
	 * The calculator's type result will be scientific, namely in power (example : 1 will be 1 * 10 ^ 0)
	 */
	Scientific,
	
	/**
	 * The calculator's type result will be normal, namely the exact decimal value, or in fraction.<br />
	 * It's the default calculator's type result.
	 */
	Normal;
	
	/**
	 * Get the default calculator's type result.
	 * @return The default calculator's type result.
	 */
	public TypeResult getDefaultTypeResult() {
		return Normal;
	}
}
