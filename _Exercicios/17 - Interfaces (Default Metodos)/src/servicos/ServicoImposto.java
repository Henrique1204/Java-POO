package servicos;

import java.security.InvalidParameterException;

public interface ServicoImposto
{
	double getTaxa();

	default double calcularPagamento(double montante, int meses)
	{
		if(meses < 1)
		{
			throw new InvalidParameterException("Parametro deve ser maior que zero");
		}

		return montante * Math.pow(1 + this.getTaxa() / 100, meses);
	}
}
