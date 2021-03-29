package com.diploma.diploma.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Diploma
{
    private Alumno alumno;
    private double promedio;
    private String mensaje;
}
