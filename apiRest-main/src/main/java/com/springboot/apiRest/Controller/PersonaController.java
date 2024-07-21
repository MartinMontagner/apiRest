package com.springboot.apiRest.Controller;

import com.springboot.apiRest.Model.Persona;
import com.springboot.apiRest.Service.PersonaService;
import com.springboot.apiRest.Service.personaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping("/persona")
    @ResponseBody
    public List<Persona> listarPersona()
    {
        return personaService.listarPersonas();
    }

    @PostMapping("/post")
    @ResponseBody
    public Persona crearPersona(@RequestBody Persona persona){
        return personaService.crearPersona(persona);
    }
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        personaService.borrarPersona(id);
    }
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Persona buscarPersonaPorId(@PathVariable Long id){
        return personaService.buscarPersonaPorId(id);
    }

    @PutMapping("/modificar")
    public void modificarPersona(@RequestBody Persona persona){
        personaService.modificarPersona(persona);
    }

    @PostMapping("/login")
    public personaDTO login (@RequestBody Persona persona){
        return personaService.login(persona.getUser(),persona.getPassword());
    }


}
