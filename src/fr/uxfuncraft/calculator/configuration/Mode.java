package fr.uxfuncraft.calculator.configuration;

public enum Mode {
	/**
	 * The calculator's mode will be degrees. Use for Cosine, Sine and Tangent.<br />
	 * It's set to default.
	 */
	Degrees,
	
	/**
	 * The calculator's mode will be radiant. Use for Cosine, Sine and Tangent.
	 */
	Radiant,
	
	/**
	 * The calculator's mode will be gradient. Use for Cosine, Sine and Tangent.
	 */
	Gradient;
	
	/**
	 * Get the default calculator's mode
	 * @return The default calculator's mode
	 */
	public Mode getDefaultMode() {
		return Degrees;
	}
}
