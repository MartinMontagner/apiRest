package com.springboot.apiRest.Repository;

import com.springboot.apiRest.Model.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
    public Persona findByUserAndPassword(String user, String password);

}
