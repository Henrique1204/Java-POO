package model.entidades;

public class Candidato
{
	private String nome;
	private Integer votos;

	//Construtores
	public Candidato() {}

	public Candidato(String nome, Integer votos)
	{
		this.setNome(nome);
		this.setVotos(votos);
	}

	//Getters
	public String getNome() {
		return nome;
	}

	public Integer getVotos() {
		return votos;
	}

	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setVotos(Integer votos) {
		this.votos = votos;
	}

	//Métodos sobrescresvidos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Candidato other = (Candidato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	
}