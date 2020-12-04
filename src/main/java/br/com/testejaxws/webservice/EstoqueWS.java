package br.com.testejaxws.webservice;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.WebParam;

import br.com.testejaxws.dao.ItemDao;
import br.com.testejaxws.model.Item;
import br.com.testejaxws.model.ListaItens;

@WebService
public class EstoqueWS {
	
	private ItemDao dao = new ItemDao();

	@WebMethod(operationName="todosOsItens")// Muda o nome do método que vai ser chamado no body da requisição
	@WebResult(name="itens") //Muda o nome do retorno da requisição
    public ListaItens getItens() {
        return new ListaItens(dao.getTodosOsItens());
    }
	
	@WebMethod(operationName="CadastrarItem")
	@WebResult(name="item")
	public Item CadastrarItem(@WebParam(name="item") Item item) {
		return dao.cadastrar(item);
	}

}
