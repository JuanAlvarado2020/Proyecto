/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dto.AreaDto;
import entity.Area;
import java.util.ArrayList;
import java.util.List;
import mappers.AreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AreaRepository;

/**
 *
 * @author johannaarcesantillan
 */
@Service
public class AreaService {
  
    @Autowired
    private AreaRepository repository;
    @Autowired
    private AreaMapper areaMapper;

    public List<AreaDto> consultarAreas() {
        List<Area> areas = repository.findAll();
        
        return areaMapper.toDto(areas);
    }

}