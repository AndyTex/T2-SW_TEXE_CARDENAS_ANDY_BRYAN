package pe.edu.cibertec.exament2.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


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
}
