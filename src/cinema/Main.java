package cinema;

public class Main {

	public static void main(String[] args) {
		
		Filme filme = new Filme();
		filme.setNome("D&D");
		filme.setValorIngresso(28d);
		
		Ingresso ingresso1 = new MeiaEntrada();
		Ingresso ingresso2 = new MeiaEntrada();
		Ingresso ingresso3 = new EntradaCompleta();
		Ingresso ingresso4 = new EntradaCompleta();
		
		ingresso1.comprarIngresso(filme);
		ingresso2.comprarIngresso(filme);
		ingresso3.comprarIngresso(filme);
		ingresso4.comprarIngresso(filme);
		
		System.out.println(ingresso1);
		System.out.println(ingresso2);
		System.out.println(ingresso3);
		System.out.println(ingresso4);
	}

}
