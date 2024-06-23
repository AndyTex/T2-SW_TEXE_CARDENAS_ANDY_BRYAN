package pe.edu.cibertec.exament2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.exament2.model.Medico;
import pe.edu.cibertec.exament2.repository.MedicoRepository;

import java.util.List;

@Service
public class MedicoService implements IMedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    @Override
    public List<Medico> findAll() {
        return medicoRepository.findAll();
    }

    @Override
    public Medico findById(Long id) {
        return medicoRepository.findById(id).orElse(null);
    }

    @Override
    public Medico save(Medico medico) {
        return medicoRepository.save(medico);
    }

    @Override
    public Medico update(Long id, Medico medico) {
        if (medicoRepository.existsById(id)) {
            medico.setIdMedico(id);
            return medicoRepository.save(medico);
        }
        return null;
    }



}
