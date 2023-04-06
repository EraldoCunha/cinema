package cinema;

public class MeiaEntrada extends Ingresso{

	private final double descontoIngresso = 50;
	
	public MeiaEntrada() {
		super();
	}
	
	public MeiaEntrada(double valorIngresso, Filme filme) {
		super(valorIngresso, filme);
	}


	@Override
	public Ingresso comprarIngresso(Filme filme) {
		Ingresso novoIngresso = new MeiaEntrada(filme.getValorIngresso() * descontoIngresso /100, filme);
		ingressosVendidos.add(novoIngresso);
		return novoIngresso;
	}
	
}
