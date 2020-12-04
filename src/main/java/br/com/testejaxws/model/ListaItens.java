package br.com.testejaxws.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement//Diz que esta classe será a raiz dos itens
@XmlAccessorType(XmlAccessType.FIELD)//Diz que o acesso será pelo atributo, não precisando de getters e setters
//Classe responsável por empacotar a lista de itens
public class ListaItens {
	
	@XmlElement(name="item") //Diz que cada elemento na lista é um Item
	private List<Item> itens;
		
	//Os 2 construtores são necessários
	public ListaItens(List<Item> itens) {
		this.itens = itens;
	}

	public ListaItens() {}
	
}
