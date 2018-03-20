package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;

public class TesteRequestSoapComJava {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub

		LivrariaWS cliente = new LivrariaWSProxy();// proxy: usar a interface LivrariaWS que foi gerado pelo Eclipse.
													// Vamos referenciar um objeto que sabe fazer a chamada remota e
													// gerar SOAP.

		Livro[] livros = cliente.getLivrosPeloNome("Mogi"); // chamada HTTP com SOAP

		for (Livro livro : livros) {
			System.out.println(livro.getTitulo());
			System.out.println(livro.getAutor().getNome());
		}

	}

}
