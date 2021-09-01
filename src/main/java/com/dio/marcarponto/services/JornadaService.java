package com.dio.marcarponto.services;

import com.dio.marcarponto.models.JornadaTrabalho;
import com.dio.marcarponto.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

   @Autowired
   JornadaRepository jornadaRepository;

   public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
      return jornadaRepository.save(jornadaTrabalho);
   }
    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> getList() {
         return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(long id) {
       return jornadaRepository.findById(id);
    }

    public void delete(long id) {
        jornadaRepository.deleteById(id);
    }
}
