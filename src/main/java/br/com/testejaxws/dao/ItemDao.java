package br.com.testejaxws.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.testejaxws.model.Item;

public class ItemDao {
	
	private static List<Item> ITENS = new ArrayList<Item>();
	
	public ItemDao() {
        // populando alguns itens no estoque
        ITENS.add(new Item("MEA", "MEAN", "Livro", 5));
        ITENS.add(new Item("SEO", "SEO na Prática", "Livro", 4));
        ITENS.add(new Item("IP4", "IPhone 4 C", "Celular", 7));
        ITENS.add(new Item("GAL", "Galaxy Tab", "Tablet", 3));
        ITENS.add(new Item("MOX", "Moto X", "Celular" , 6));
    }
	
	public List<Item> getTodosOsItens() {
		System.out.println("Chamando getItens()");
		return ITENS;
	}
	
	public Item cadastrar(Item item) {
		System.out.println("Cadastro Realizado com Sucesso!");
		System.out.println(item);
		return item;
	}

}
