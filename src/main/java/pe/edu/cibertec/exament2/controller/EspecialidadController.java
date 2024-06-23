package pe.edu.cibertec.exament2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.exament2.model.Especialidad;
import pe.edu.cibertec.exament2.service.EspecialidadService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/especialidad")
public class EspecialidadController {

    @Autowired
    private EspecialidadService especialidadService;

    @GetMapping
    public List<Especialidad> getAllEspecialidades() {
        return especialidadService.findAll();
    }

    @GetMapping("/{id}")
    public Especialidad getEspecialidadById(@PathVariable Long id) {
        return especialidadService.findById(id);
    }

    @PostMapping
    public Especialidad createEspecialidad(@RequestBody Especialidad especialidad) {
        return especialidadService.save(especialidad);
    }

    @PutMapping("/{id}")
    public Especialidad updateEspecialidad(@PathVariable Long id, @RequestBody Especialidad especialidad) {
        return especialidadService.update(id, especialidad);
    }


}
