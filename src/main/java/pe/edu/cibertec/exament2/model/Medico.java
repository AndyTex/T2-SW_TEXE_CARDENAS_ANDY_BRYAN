package pe.edu.cibertec.exament2.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Entity
@Data

public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedico;
    private String nomMedico;
    private String apeMedico;
    @Temporal(TemporalType.DATE)
    private Date fechNacMedico;

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Especialidad> especialidades;
}
