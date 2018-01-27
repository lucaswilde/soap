package br.com.caelum.estoque.cliente;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TesteClienteSoapDinamico {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("http://localhost:8080/estoque-web/EstoqueWS?wsdl");
		QName qName = new QName("http://ws.estoque.caelum.com.br/", "EstoqueWS");
		
		Service service = Service.create(url, qName);
				
		EstoqueWS cliente = service.getPort(EstoqueWS.class);
		
		System.out.println("EstoqueWS Port: " + cliente);
		
		ListaItens listaItens = cliente.todosOsItens(new Filtros());
		System.out.println(listaItens.item.size());
		
		for (Item item : listaItens.item) {
			System.out.println(item.getNome() +"\n");
		}
	}

}
