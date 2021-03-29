package com.diploma.diploma.controllers;

import com.diploma.diploma.dtos.AlumnoDto;
import com.diploma.diploma.dtos.AlumnoDtoMapper;
import com.diploma.diploma.dtos.DiplomaDtoMapper;
import com.diploma.diploma.entities.Diploma;
import com.diploma.diploma.services.AlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alumno")
public class AlumnoController
{
    @PostMapping("/diploma")
    public ResponseEntity<?> diploma(@RequestBody AlumnoDto alumno)
    {
        Diploma d =  AlumnoService.getDiploma(AlumnoDtoMapper.mapToAlumno(alumno));
        return ResponseEntity.ok(DiplomaDtoMapper.mapToDto(d));
    }
}
