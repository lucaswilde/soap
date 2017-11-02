package br.com.caelum.estoque.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import br.com.caelum.estoque.modelo.item.Filtro;
import br.com.caelum.estoque.modelo.item.Filtros;
import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;

@WebService
public class EstoqueWS {

    private ItemDao dao = new ItemDao();

    @WebMethod(operationName="todosOsItens")
    @RequestWrapper(localName="listaItens")
    @ResponseWrapper(localName="itens") // muda o retorno de todosOsItensResponse para itens
    @WebResult(name="item")
    public List<Item> getItens(@WebParam(name="filtros") Filtros filtros) {
        System.out.println("Chamando getItens()");
        
        List<Filtro> listaFiltros = filtros.getLista();
        return dao.todosItens(listaFiltros);
    }
    
    @WebMethod(exclude=true)
    public void outroMetodo() {
        //nao vai fazer parte do WSDL
    }
    
}