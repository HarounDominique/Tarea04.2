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
	public long createEmpleado(Departamento empleado) throws DuplicateInstanceException {

			return departamentoDao.create(empleado);

	}

	@Override
	public boolean deleteEmpleado(Departamento departamento) {
	return departamentoDao.delete(empleado);
	}

	@Override
	public boolean update(Departamento departamento) {
		return departamentoDao.update(departamento);
	}

	@Override
	public Departamento findByOID(long longOid) throws InstanceNotFoundException {
		return departamentoDao.read(longOid);
	}

	@Override
	public List<Departamento> findAll() {
		return departamentoDao.findAll();
	}

	
	@Override
	public boolean exists(Integer empno) {
		return departamentoDao.exists(empno);
	}

	@Override
	public long create(Departamento dept) throws DuplicateInstanceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(Departamento dept) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Departamento dept) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Departamento> findByJob(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
