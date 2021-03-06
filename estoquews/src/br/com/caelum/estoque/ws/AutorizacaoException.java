package br.com.caelum.estoque.ws;

import java.util.Date;

import javax.xml.ws.WebFault;

@WebFault(name="AutorizacaoFault")
public class AutorizacaoException extends Exception {
	// esse numero eh relacionado com a serializacao do java.io mas nao importa
	// nesse contexto
	private static final long serialVersionUID = 1L;

	public AutorizacaoException(String msg) {
		super(msg);
	}

	// ser� usado pelo JAX-B para definir o conte�do do elemento detail do Fault
	public InfoFault getFaultInfo() {
		return new InfoFault("Token invalido", new Date());
	}
}
