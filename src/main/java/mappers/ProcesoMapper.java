/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mappers;

import java.util.List;
import org.mapstruct.Mapper;
import dto.ProcesoDto;
import entity.Proceso;



/**
 *
 * @author johannaarcesantillan
 */
@Mapper(componentModel = "spring")
public interface ProcesoMapper {
    ProcesoDto toDto(Proceso proceso);
    
    Proceso toEntity(ProcesoDto dto);
    
    List<ProcesoDto> toDto(List<Proceso> procesos);
    
    List<Proceso> toEntity(List<ProcesoDto> procesos);
    
    
}
