package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	//operacao responsvel por iserir no banco de dados esse obj quando enviar como parametro de entrada 
		void insert(Seller obj);
		void update(Seller obj);
		void deleteById(Integer id);
		//operacao responsavel por pegar esse id e consultar no banco de dados o objeto com esse id, se existir vai retornar
		Seller findById(Integer id);
		//retornar todos departamentos
		List<Seller> findAll();

}
