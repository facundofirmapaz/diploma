package com.diploma.diploma.dtos;

import com.diploma.diploma.entities.Asignatura;

public class AsignaturaDtoMapper
{
    public static Asignatura mapToAsignatura(AsignaturaDto a)
    {
        return new Asignatura(a.getNombre(), a.getNota());
    }

    public static AsignaturaDto mapToDto(Asignatura a)
    {
        return new AsignaturaDto(a.getNombre(), a.getNota());
    }
}
