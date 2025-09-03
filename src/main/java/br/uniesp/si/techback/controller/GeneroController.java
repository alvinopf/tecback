package br.uniesp.si.techback.controller;

import br.uniesp.si.techback.model.Filme;
import br.uniesp.si.techback.model.Genero;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/generos")

public class GeneroController {

    private List<Genero> lista = new ArrayList<>();
    public long contador = 1;

    @PostMapping
    public Genero incluir(Genero genero){
        genero.setId(contador);
        ++contador;
        lista.add(genero);
        return genero;
    }

    @GetMapping
    public List<Filme> listar(){
        return lista;
    }


}
