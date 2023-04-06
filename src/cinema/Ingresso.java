package cinema;

import java.util.ArrayList;
import java.util.List;

public abstract class Ingresso {

	private double valorIngresso;
	protected Filme filme;
	protected List<Ingresso> ingressosVendidos= new ArrayList<>();
	
	public Ingresso() {
	}

	public Ingresso(double valorIngresso, Filme filme) {
		this.valorIngresso = valorIngresso;
		this.filme = filme;
	}


	public double getValorIngresso() {
		return valorIngresso;
	}


	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}


	public Filme getFilme() {
		return filme;
	}


	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	

	
	
	public abstract Ingresso comprarIngresso(Filme filme);

	@Override
	public String toString() {
		for(Ingresso vendidos: ingressosVendidos) {
		return "Ingressos vendidos = " 
				+ vendidos.getFilme().getNome()
				+ " R$"
				+ vendidos.getValorIngresso();
		}
		return null;
	
	}
}
