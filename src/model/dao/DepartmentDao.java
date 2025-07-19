package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	//operacao responsvel por iserir no banco de dados esse obj quando enviar como parametro de entrada 
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	//operacao responsavel por pegar esse id e consultar no banco de dados o objeto com esse id, se existir vai retornar
	Department findById(Integer id);
	//retornar todos departamentos
	List<Department> findAll();

}
