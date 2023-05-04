package modelo.servicio.departamento;

import java.util.List;

import modelo.Departamento;
import modelo.exceptions.DuplicateInstanceException;
import modelo.exceptions.InstanceNotFoundException;

public interface IServicioDepartamento {

	public long create(Departamento dept) throws DuplicateInstanceException;

	public boolean delete(Departamento dept);

	public boolean update(Departamento dept);

	public List<Departamento> findAll();

	public List<Departamento> findByJob(String string);

	public boolean exists(Integer deptno);

}
