/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.services;

import java.util.List;
import org.proyecto.dto.ProyectoDto;
import org.proyecto.entity.Proyecto;
import org.proyecto.mappers.ProyectoMapper;
import org.proyecto.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectoService {

    @Autowired
    private ProyectoRepository repository;
    @Autowired
    private ProyectoMapper mapper;

    public List<ProyectoDto> consultarProyectos() {
        List<Proyecto> proyectos = repository.findAll();
        return mapper.toDto(proyectos);
    }

    public ProyectoDto guardarProyecto(ProyectoDto dto) {
        Proyecto proyecto = mapper.toEntity(dto);
        proyecto = repository.save(proyecto);
        return mapper.toDto(proyecto);
    }

}