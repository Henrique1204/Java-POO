package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusPedido;

public class Pedido
{
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date momento;
	private StatusPedido status;
	private Cliente cliente;
	private List<ItemPedido> pedidos = new ArrayList<>();

	//Construtores
	public Pedido() {}

	public Pedido(Cliente cliente, StatusPedido status)
	{
		this.setCliente(cliente);
		this.setStatus(status);
		this.setMomento();
	}

	//Getters
	public Date getMomento()
	{
		return this.momento;
	}

	public StatusPedido getStatus()
	{
		return this.status;
	}

	public Cliente getCliente()
	{
		return this.cliente;
	}

	public List<ItemPedido> getPedidos()
	{
		return this.pedidos;
	}

	//Setters
	public void setMomento()
	{
		this.momento = new Date();
	}

	public void setStatus(StatusPedido status)
	{
		this.status = status;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

	//Métodos sobrescrevidos
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Sumário do Pedido:\n");
		sb.append("Momento do pedido: " + sdf.format(this.getMomento()) + ".\n");
		sb.append("Status do pedido: " + this.getStatus() + ".\n");
		sb.append("Cliente: " + this.getCliente().toString() + ".\n");
		sb.append("Itens Pedidos:\n");

		for(ItemPedido pedido : pedidos)
		{
			sb.append(pedido.toString() + "\n");
		}

		sb.append(String.format("Preço total: R$ %.2f", this.total()));

		return sb.toString();
	}

	//Métodos comuns
	public void addItem(ItemPedido pedido)
	{
		this.pedidos.add(pedido);
	}

	public void removeItem(ItemPedido pedido)
	{
		this.pedidos.remove(pedido);
	}

	public Double total()
	{
		double soma = 0;
		for(ItemPedido pedido : pedidos)
		{
			soma += pedido.subTotal();
		}

		return soma;
	}
}
