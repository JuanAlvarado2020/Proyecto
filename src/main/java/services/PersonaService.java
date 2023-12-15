/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dto.AreaDto;
import dto.PersonaDto;
import entity.Area;
import entity.Persona;
import java.util.ArrayList;
import java.util.List;
import mappers.PersonaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PersonaRepository;

/**
 *
 * @author johannaarcesantillan
 */
@Service
public class PersonaService {
    
    @Autowired
    private PersonaRepository repository;
    @Autowired
    private PersonaMapper mapper;
    
    public List<PersonaDto> consultarPersonas() {
        List<Persona> personas = repository.findAll();
        List<PersonaDto>  personasDtos = mapper.toDto(personas);
        /*for(Persona persona  : personas) {
            PersonaDto dto = new PersonaDto();
            dto.setId(persona.getId());
            dto.setNombre(persona.getNombre());
            dto.setApellido(persona.getApellido());
            personasDtos.add(dto);
        }
*/
        return personasDtos;
        
        }
     }   
