package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Post;

public class Program
{
	public static void main(String[] args) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comentario c1 = new Comentario("Primeiro comentário.");
		Comentario c2 = new Comentario("Segundo comentário.");
		Comentario c3 = new Comentario("Terceiro comentário.");
		Comentario c4 = new Comentario("Quarto comentário.");

		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Primeiro post", "É o primeiro post né.", 12);
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Segundo post", "É o segundo post né.", 5);

		p1.addComentario(c1);
		p1.addComentario(c2);

		p2.addComentario(c3);
		p2.addComentario(c4);

		System.out.println(p1);
		System.out.println(p2);
	}
}