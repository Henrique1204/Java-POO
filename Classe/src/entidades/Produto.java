package entidades;

public class Produto {
	public String nome;
	public double preco;
	public int quant;

	public double valorTotalEstoque() {
		return quant * preco;
	}

	public void atualizarEstoque(int quant, String opcao) {
		String teste = opcao.toLowerCase();
		this.quant = teste == "add" ? this.quant + quant : this.quant - quant;
		System.out.println("Dados Atualizados: " + nome + ", $ " + preco + ", quantidade " + this.quant + ", Total: " + valorTotalEstoque());
	}

	public String toString() {
		return "Dados do Produto: " + nome + ", $ " + String.format("%.2f", preco) + ", quantidade " + quant + ", Total: " + valorTotalEstoque();
	}
}
