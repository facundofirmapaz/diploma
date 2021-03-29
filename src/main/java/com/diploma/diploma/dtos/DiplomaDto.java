package com.diploma.diploma.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DiplomaDto
{
    private AlumnoDto alumno;
    private double promedio;
    private String mensaje;
}
