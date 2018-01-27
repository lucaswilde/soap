package br.com.caelum.estoque.ws;

import javax.jws.WebService;

@WebService(endpointInterface="br.com.caelum.estoque.ws.EstoqueWS"
	,serviceName="EstoqueWS"
	,portName="EstoqueWSPort")
public class EstoqueWSImpl implements EstoqueWS{

	private ListaItens lista = new ListaItens();
	
	@Override
	public ListaItens todosOsItens(Filtros filtros) {
		System.out.println("Chamando todos os Itens");
		Item item = new Item();
		item.setCodigo("CHU");
		item.setNome("CHURRASCO");
		item.setQuantidade(5);
		item.setTipo("COMIDA");
		
		adicionarItem(item);
		
        return lista;
	}

	@Override
	public CadastrarItemResponse cadastrarItem(CadastrarItem parameters, TokenUsuario tokenUsuario)
			throws AutorizacaoFault {
		System.out.println("Chamando cadastarItem");
		
		adicionarItem(parameters.getItem());
		
        return new CadastrarItemResponse();
	}
	
	private void adicionarItem(Item item) {
		lista.getItem().add(item);
	}

}
