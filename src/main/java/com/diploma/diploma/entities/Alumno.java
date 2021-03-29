package com.diploma.diploma.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Alumno
{
    private String nombre;
    private String apellido;
    private ArrayList<Asignatura> asignaturas;
}
