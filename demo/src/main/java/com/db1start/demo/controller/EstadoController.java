package com.db1start.demo.controller;

import com.db1start.demo.adapter.EstadoAdapter;
import com.db1start.demo.domain.entity.Estado;
import com.db1start.demo.dto.EstadoDTO;
import com.db1start.demo.dto.EstadoFormDTO;
import com.db1start.demo.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping
    public List<EstadoDTO> buscarTodosEstados() {
        List<Estado> estados = estadoService.buscarTodos();
        List<EstadoDTO> listaDeRetorno = new ArrayList<>();
        estados.forEach(estado -> {
            EstadoDTO meuEstadoDTO = EstadoAdapter.transformaEntidadeParaDTO(estado);
            listaDeRetorno.add(meuEstadoDTO);
        });
        return listaDeRetorno;
    }

    @PostMapping
    public void cadastrarNovoEstado(@RequestBody EstadoFormDTO formDTO){
        estadoService.criar(formDTO.getNome());
    }

}
