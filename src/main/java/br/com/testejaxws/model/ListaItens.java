package br.com.testejaxws.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement//Diz que esta classe ser� a raiz dos itens
@XmlAccessorType(XmlAccessType.FIELD)//Diz que o acesso ser� pelo atributo, n�o precisando de getters e setters
//Classe respons�vel por empacotar a lista de itens
public class ListaItens {
	
	@XmlElement(name="item") //Diz que cada elemento na lista � um Item
	private List<Item> itens;
		
	//Os 2 construtores s�o necess�rios
	public ListaItens(List<Item> itens) {
		this.itens = itens;
	}

	public ListaItens() {}
	
}
