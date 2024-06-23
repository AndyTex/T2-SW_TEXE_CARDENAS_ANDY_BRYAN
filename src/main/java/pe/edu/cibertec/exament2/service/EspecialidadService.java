package pe.edu.cibertec.exament2.service;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.cibertec.exament2.model.Especialidad;
import pe.edu.cibertec.exament2.repository.EspecialidadRepository;

import java.util.List;

public class EspecialidadService implements IEspecialidadService {


    @Autowired
    private EspecialidadRepository especialidadRepository;

    @Override
    public List<Especialidad> findAll() {
        return especialidadRepository.findAll();
    }

    @Override
    public Especialidad findById(Long id) {
        return especialidadRepository.findById(id).orElse(null);
    }

    @Override
    public Especialidad save(Especialidad especialidad) {
        return especialidadRepository.save(especialidad);
    }

    @Override
    public Especialidad update(Long id, Especialidad especialidad) {
        if (especialidadRepository.existsById(id)) {
            especialidad.setIdEspecialidad(id);
            return especialidadRepository.save(especialidad);
        }
        return null;
    }
}
