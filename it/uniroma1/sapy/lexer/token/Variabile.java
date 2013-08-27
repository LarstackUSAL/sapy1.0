package it.uniroma1.sapy.lexer.token;

public class Variabile extends ValToken
{
	
	/**
	 * Costruttore
	 * @param Nome della variabile
	 */
	public Variabile(String valoreToken)
	{
		super(Tok.VARIABILE, valoreToken);
	}
	
}
