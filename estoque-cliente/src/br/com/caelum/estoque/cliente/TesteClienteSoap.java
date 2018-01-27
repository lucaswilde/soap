package br.com.caelum.estoque.cliente;

public class TesteClienteSoap {

	public static void main(String[] args) {
		EstoqueWS cliente = new EstoqueWS_Service().getEstoqueWSPort();
		System.out.println("EstoqueWS Port: " + cliente);
		
		ListaItens listaItens = cliente.todosOsItens(new Filtros());
		System.out.println(listaItens.item.size());
		
		for (Item item : listaItens.item) {
			System.out.println(item.getNome() +"\n");
		}
	}

}
