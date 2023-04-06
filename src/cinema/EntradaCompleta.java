package cinema;

public class EntradaCompleta extends Ingresso{
	
	public EntradaCompleta() {
	}
	
	public EntradaCompleta(double valorIngresso, Filme filme) {
		super(valorIngresso, filme);
	}


	@Override
	public Ingresso comprarIngresso(Filme filme) {
		Ingresso novoIngresso = new EntradaCompleta(filme.getValorIngresso(), filme);
		ingressosVendidos.add(novoIngresso);
		return novoIngresso;
	}
}
