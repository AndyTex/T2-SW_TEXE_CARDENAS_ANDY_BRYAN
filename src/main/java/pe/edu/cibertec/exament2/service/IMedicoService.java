package pe.edu.cibertec.exament2.service;

import pe.edu.cibertec.exament2.model.Medico;

import java.util.List;

public interface IMedicoService {

    List<Medico> findAll();
    Medico findById(Long id);
    Medico save(Medico medico);
    Medico update(Long id, Medico medico);
}
