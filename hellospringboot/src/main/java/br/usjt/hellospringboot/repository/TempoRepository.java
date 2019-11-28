package br.usjt.hellospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.hellospringboot.model.Tempo;

public interface TempoRepository extends JpaRepository<Tempo, Long>{

}
