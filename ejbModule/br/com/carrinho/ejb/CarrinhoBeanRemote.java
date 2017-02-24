package br.com.carrinho.ejb;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface CarrinhoBeanRemote {

	void cadastrarItem(Item item);

	List<Item> obterItens();

	int obterQuantidadeItens();

	void adicionarEmail(int matricula, String email);

}
