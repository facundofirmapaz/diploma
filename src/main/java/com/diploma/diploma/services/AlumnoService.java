package com.diploma.diploma.services;

import com.diploma.diploma.entities.Alumno;
import com.diploma.diploma.entities.Asignatura;
import com.diploma.diploma.entities.Diploma;

public class AlumnoService
{
    public static Diploma getDiploma(Alumno alumno)
    {
        double promedio;
        double total = 0;

        for (Asignatura asig: alumno.getAsignaturas())
            total += asig.getNota();

        promedio = total / alumno.getAsignaturas().size();

        String mensaje = promedio >= 9 ? "Felicitaciones" : "Buena igual.";

        return new Diploma(alumno, promedio, mensaje);
    }
}
