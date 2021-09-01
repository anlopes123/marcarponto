package com.dio.marcarponto.controller;

import com.dio.marcarponto.models.JornadaTrabalho;
import com.dio.marcarponto.services.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.save(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList() {
        return jornadaService.getList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> getJornadaList(@PathVariable("id") long id) {
       return ResponseEntity.ok(jornadaService.getById(id).orElseThrow(() -> new NoSuchElementException("Jornada não encontrada")));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJornada(@PathVariable("id") long id) {
        try {
            jornadaService.delete(id);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return ResponseEntity.ok("Usuario deletado com sucesso");
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.update(jornadaTrabalho);
    }
}
