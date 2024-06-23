package pe.edu.cibertec.exament2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.exament2.model.Medico;
import pe.edu.cibertec.exament2.service.MedicoService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/medico")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public List<Medico> getAllMedicos() {
        return medicoService.findAll();
    }

    @GetMapping("/{id}")
    public Medico getMedicoById(@PathVariable Long id) {
        return medicoService.findById(id);
    }

    @PostMapping
    public Medico createMedico(@RequestBody Medico medico) {
        return medicoService.save(medico);
    }

    @PutMapping("/{id}")
    public Medico updateMedico(@PathVariable Long id, @RequestBody Medico medico) {
        return medicoService.update(id, medico);
    }


}
