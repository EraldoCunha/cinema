package cinema;

public class Filme {

	private String nome;
	private Double valorIngresso;
	
	public Filme() {
		super();
	}

	public Filme(String nome, Double valorIngresso) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorIngresso() {
		return valorIngresso;
	}

	public void setValorIngresso(Double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
}


