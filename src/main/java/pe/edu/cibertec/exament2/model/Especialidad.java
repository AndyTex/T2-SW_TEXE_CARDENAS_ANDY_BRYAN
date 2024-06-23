package pe.edu.cibertec.exament2.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "especialiadad")
public class Especialidad {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEspecialidad;

    private String titulo;
    private String funcion;
    @Temporal(TemporalType.DATE)
    private Date fechGraduacion;

    @ManyToOne
    @JoinColumn(name = "idMedico", nullable = false)
    private Medico medico;
}
