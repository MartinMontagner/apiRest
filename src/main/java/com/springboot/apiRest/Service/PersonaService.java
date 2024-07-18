package com.springboot.apiRest.Service;

import com.springboot.apiRest.Model.Persona;
import com.springboot.apiRest.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepo;

    public Persona crearPersona(Persona persona){
        return personaRepo.save(persona);
    }
    public void borrarPersona(Long id){
        personaRepo.deleteById(id);
    }
    public List<Persona> listarPersonas(){
        return personaRepo.findAll();
    }
    public Persona buscarPersonaPorId(Long id){
        return personaRepo.findById(id).orElse(null);
    }
    public void modificarPersona(Persona persona){
       personaRepo.save(persona);
    }

    public Persona login(String user, String password)
    {
       return personaRepo.findByUserAndPassword(user,password);
    }

}
