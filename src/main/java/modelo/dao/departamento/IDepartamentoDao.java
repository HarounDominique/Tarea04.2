package modelo.dao.departamento;

import java.util.Date;
import java.util.List;

import modelo.Departamento;
import modelo.dao.IGenericDao;

public interface IDepartamentoDao extends IGenericDao<Departamento>{
	
	public boolean exists(Integer dept);
	
}

