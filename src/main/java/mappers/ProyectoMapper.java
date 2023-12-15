/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mappers;

/**
 *
 * @author johannaarcesantillan
 */
import dto.ProcesoDto;
import dto.ProyectoDto;
import entity.Proceso;
import entity.Proyecto;
import java.util.List;
import org.mapstruct.Mapper;



@Mapper(componentModel = "string", uses ={AreaMapper.class, PersonaMapper.class, ProcesoMapper.class} )

public interface ProyectoMapper {
    
    ProyectoDto toDto(Proyecto proyecto);
    
    Proyecto toEntity(ProyectoDto dto);
    
    List<ProyectoDto> toDto(List<Proyecto> proyectos);
    
    List<Proyecto> toEntity(List<ProyectoDto> proyectos);
    
    
}
