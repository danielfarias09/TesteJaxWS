package br.com.testejaxws.main;

import javax.xml.ws.Endpoint;

import br.com.testejaxws.webservice.EstoqueWS;

public class PublicaEstoqueWS {
	
	public static void main(String[] args) {

        EstoqueWS implementacaoWS = new EstoqueWS();
        String URL = "http://localhost:8080/estoquews";

        System.out.println("EstoqueWS rodando: " + URL);

        //associando URL com implementacao
        Endpoint.publish(URL, implementacaoWS);
    }

}
