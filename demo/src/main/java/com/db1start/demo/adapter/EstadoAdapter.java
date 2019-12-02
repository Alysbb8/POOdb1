package com.db1start.demo.adapter;

import com.db1start.demo.domain.entity.Estado;
import com.db1start.demo.dto.EstadoDTO;

public class EstadoAdapter {
    public static EstadoDTO transformaEntidadeParaDTO(Estado estado){
        EstadoDTO dto = new EstadoDTO();
        dto.setId(estado.getId());
        dto.setNome(estado.getNome());
        return dto;
    }
}
