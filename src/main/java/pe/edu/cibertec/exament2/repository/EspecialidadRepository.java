package pe.edu.cibertec.exament2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.exament2.model.Especialidad;


@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad,Long> {
}
