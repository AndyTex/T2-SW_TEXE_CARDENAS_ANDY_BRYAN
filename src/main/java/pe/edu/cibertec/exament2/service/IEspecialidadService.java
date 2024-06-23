package pe.edu.cibertec.exament2.service;

import pe.edu.cibertec.exament2.model.Especialidad;

import java.util.List;

public interface IEspecialidadService {
    List<Especialidad> findAll();
    Especialidad findById(Long id);
    Especialidad save(Especialidad especialidad);
    Especialidad update(Long id, Especialidad especialidad);
}
