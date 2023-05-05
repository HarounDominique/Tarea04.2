package modelo.servicio.departamento;

import java.util.List;

import modelo.Departamento;
import modelo.dao.departamento.DepartamentoNeoDatisDao;
import modelo.dao.departamento.IDepartamentoDao;
import modelo.exceptions.DuplicateInstanceException;
import modelo.exceptions.InstanceNotFoundException;

public class ServicioDepartamento implements IServicioDepartamento{
	
private IDepartamentoDao departamentoDao;
	
	public ServicioDepartamento() {
		departamentoDao= new DepartamentoNeoDatisDao();
	}

	@Override
	public long create(Departamento departamento) throws DuplicateInstanceException {
			return departamentoDao.create(departamento);
	}

	@Override
	public boolean delete(Departamento departamento) {
	return departamentoDao.delete(departamento);
	}

	@Override
	public boolean update(Departamento departamento) {
		return departamentoDao.update(departamento);
	}

	@Override
	public List<Departamento> findAll() {
		return departamentoDao.findAll();
	}

	
	@Override
	public boolean exists(Integer empno) {
		return departamentoDao.exists(empno);
	}

}
