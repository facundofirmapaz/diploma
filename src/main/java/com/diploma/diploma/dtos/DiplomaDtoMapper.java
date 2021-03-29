package com.diploma.diploma.dtos;

import com.diploma.diploma.entities.Diploma;

public class DiplomaDtoMapper
{
    public static DiplomaDto mapToDto(Diploma d)
    {
        return new DiplomaDto(AlumnoDtoMapper.mapToDto(d.getAlumno()), d.getPromedio(), d.getMensaje());
    }
}
