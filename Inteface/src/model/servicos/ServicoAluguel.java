package model.servicos;

import model.entidades.AluguelCarro;

public class ServicoAluguel
{
	private Double precoHora;
	private Double precoDia;

	private ServicoTaxa servicoTaxa;

	//Construtores
	public ServicoAluguel() {}

	public ServicoAluguel(Double precoHora, Double precoDia, ServicoTaxa servicoTaxa)
	{
		this.setPrecoHora(precoHora);
		this.setPrecoDia(precoDia);
		this.setServicoTaxa(servicoTaxa);
	}

	//Getters
	public Double getPrecoHora()
	{
		return this.precoHora;
	}

	public Double getPrecoDia()
	{
		return this.precoDia;
	}

	public ServicoTaxa getServicoTaxa()
	{
		return this.servicoTaxa;
	}

	//Setters
	public void setPrecoHora(Double precoHora)
	{
		this.precoHora = precoHora;
	}

	public void setPrecoDia(Double precoDia)
	{
		this.precoDia = precoDia;
	}

	public void setServicoTaxa(ServicoTaxa servicoTaxa)
	{
		this.servicoTaxa = servicoTaxa;
	}

	//Métodos implementados
	public void processarFatura(AluguelCarro aluguelCarro)
	{
		long dif = aluguelCarro.getSaida().getTime() - aluguelCarro.getChegada().getTime();
		double horas = (double) dif / 1000 / 60 / 60;
		

		//Calcula o pagamento
		double pagamento = ( horas <= 12.0 ) ? Math.ceil(horas) * this.getPrecoHora() : Math.ceil((horas / 24)) * this.getPrecoDia() ;

		//Saída do processamento
		System.out.printf("Pagamento básico: %.2f%n", pagamento);
		System.out.printf("Taxa: %.2f%n", this.getServicoTaxa().taxa(pagamento) );
		System.out.printf("Pagamento total: %.2f", ( pagamento + this.getServicoTaxa().taxa(pagamento) ) );
	}
}
