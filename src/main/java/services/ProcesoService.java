/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dto.PersonaDto;
import dto.ProcesoDto;
import entity.Persona;
import entity.Proceso;
import java.util.List;
import mappers.PersonaMapper;
import mappers.ProcesoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PersonaRepository;
import repository.ProcesoRepository;

/**
 *
 * @author johannaarcesantillan
 */
@Service
public class ProcesoService {
    
    @Autowired
    private ProcesoRepository repository;
    @Autowired
    private ProcesoMapper mapper;
    
    public List<ProcesoDto> consultarProceso() {
        List<Proceso> procesos = repository.findAll();
        List<ProcesoDto>  procesosDtos = mapper.toDto(procesos);
        
        return procesosDtos;
        
       
    }
 
}
