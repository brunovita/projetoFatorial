public class Fatorial
{
	// Versao iterativa do calculo do fatorial
	public int calcularFatorial(int n) throw IllegalArgumentException
	{
		if (n < 0)
		{
			throw new IllegalArgumentException("n�o existe fatorial para numeros negativos");
		}
		int resultado = 1;
		if (n != 0)
		{
			for (int i = 2; i <= n; i++)
			{
				resultado *= i;
			}
		}
		return resultado;
	}
}