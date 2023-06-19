package com.alonsopedro.projectcartolabasquete.controller.dtos;

import jakarta.validation.constraints.NotBlank;

public record IntegranteRecordDto(@NotBlank String nome, @NotBlank String funcao, @NotBlank String franquia) {
}
