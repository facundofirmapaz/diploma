package com.diploma.diploma.dtos;

import com.diploma.diploma.entities.Alumno;
import com.diploma.diploma.entities.Asignatura;

import java.util.ArrayList;

public class AlumnoDtoMapper
{
    public static Alumno mapToAlumno(AlumnoDto a)
    {
        ArrayList<Asignatura> asignaturas = new ArrayList<>();

        for (AsignaturaDto as: a.getAsignaturas())
            asignaturas.add(AsignaturaDtoMapper.mapToAsignatura(as));

        return new Alumno(a.getNombre(), a.getApellido(), asignaturas);
    }

    public static AlumnoDto mapToDto(Alumno a)
    {
        ArrayList<AsignaturaDto> asignaturaDtos = new ArrayList<>();

        for (Asignatura as: a.getAsignaturas())
            asignaturaDtos.add(AsignaturaDtoMapper.mapToDto(as));

        return new AlumnoDto(a.getNombre(), a.getApellido(), asignaturaDtos);
    }
}
