package entidades;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente
{
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String nome, email;
	private Date dataAniversario;

	//Construtores
	public Cliente() {}

	public Cliente(String nome, String email, Date dataAniversario)
	{
		this.setNome(nome);
		this.setEmail(email);
		this.setDataAniversario(dataAniversario);
	}

	//Getters
	public String getNome() {
		return this.nome;
	}

	public String getEmail() {
		return this.email;
	}

	public Date getDataAniversario() {
		return this.dataAniversario;
	}

	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	//Métodos sobrescrevidos
	public String toString()
	{
		return this.getNome() + " (" + sdf.format(this.getDataAniversario()) + ") - " + this.getEmail(); 
	}
}
