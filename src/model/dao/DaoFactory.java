package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

//vai ter operacoes estaticas para instanciar os daos
public class DaoFactory {
	
	//retornar um seller dao
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}

}
