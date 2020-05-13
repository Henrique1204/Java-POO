package entidade;

public class Cliente
{
	private String nome, email;

	//Construtores
	public Cliente() {}

	public Cliente(String nome, String email)
	{
		this.setNome(nome);
		this.setEmail(email);
	}

	//Getters
	public String getNome() {
		return this.nome;
	}

	public String getEmail() {
		return this.email;
	}

	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//Métodos sobrescevidos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Cliente other = (Cliente) obj;

		if (email == null)
		{
			if (other.email != null)
				return false;
		}
		else if (!email.equals(other.email))
			return false;
		if (nome == null)
		{
			if (other.nome != null)
				return false;
		}
		else if (!nome.equals(other.nome))
			return false;

		return true;
	}
}
