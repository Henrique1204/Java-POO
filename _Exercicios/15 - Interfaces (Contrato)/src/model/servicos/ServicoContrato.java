package model.servicos;

import java.util.Calendar;
import java.util.Date;

import model.entidades.Contrato;
import model.entidades.Prestacao;

public class ServicoContrato
{
	private ServicoPagamento servicoPagamento;

	//Construtores
	public ServicoContrato() {}

	public ServicoContrato(ServicoPagamento servicoPagamento)
	{
		this.setServicoPagamento(servicoPagamento);
	}

	//Getters
	public ServicoPagamento getServicoPagamento()
	{
		return this.servicoPagamento;
	}

	//Setters
	public void setServicoPagamento(ServicoPagamento servicoPagamento)
	{
		this.servicoPagamento = servicoPagamento;
	}

	//métodos implementados
	public void processarContrato(Contrato contrato, int meses)
	{
		double cotaBasica = contrato.getValorContrato() / meses;

		for(int i = 0; i < meses; i++)
		{
			Date data = addMeses(contrato.getDataContrato(), (i +1));

			double cotaAtualizada = cotaBasica + servicoPagamento.calcularPagamento(cotaBasica, (i + 1));
			double cotaCheia = cotaAtualizada + servicoPagamento.calcularPagamentoLivre(cotaAtualizada);

			contrato.addPrestacao(new Prestacao(data, cotaCheia));
		}
	}

	public Date addMeses(Date data, int n)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);

		return cal.getTime();
	}
}
