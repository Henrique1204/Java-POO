package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post
{
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer likes;

	private List<Comentario> comentarios = new ArrayList<>();

	//Construtores
	public Post() {}

	public Post(Date momento, String titulo, String conteudo, Integer likes)
	{
		this.setMomento(momento);
		this.setTitulo(titulo);
		this.setConteudo(conteudo);
		this.setLikes(likes);
	}

	//Getters
	public Date getMomento()
	{
		return this.momento;
	}

	public String getTitulo()
	{
		return this.titulo;
	}

	public String getConteudo()
	{
		return this.conteudo;
	}

	public Integer getLikes()
	{
		return this.likes;
	}

	public List<Comentario> getComentarios()
	{
		return this.comentarios;
	}

	//Setters
	public void setMomento(Date momento)
	{
		this.momento = momento;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public void setConteudo(String conteudo)
	{
		this.conteudo = conteudo;
	}

	public void setLikes(Integer likes)
	{
		this.likes = likes;
	}

	//Métodos sobrescrevidos
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(this.getTitulo() + "\n");
		sb.append(this.getLikes() + " Likes - " + sdf.format((this.getMomento())) + "\n");
		sb.append(this.getConteudo() + "\n");
		sb.append("Comentário:\n");

		for(Comentario comentario : comentarios)
		{
			sb.append(comentario.getTexto() + "\n");
		}

		return sb.toString();
	}

	//Métodos comuns
	public void addComentario(Comentario comentario)
	{
		comentarios.add(comentario);
	}

	public void removeComentario(Comentario comentario)
	{
		comentarios.remove(comentario);
	}
}