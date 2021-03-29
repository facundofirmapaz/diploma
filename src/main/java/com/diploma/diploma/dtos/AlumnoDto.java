package com.diploma.diploma.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class AlumnoDto
{
    private String nombre;
    private String apellido;
    private ArrayList<AsignaturaDto> asignaturas;
}
