package br.unipar.frameworks.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

public record ProductRequest(
        @NotBlank(message = "O nome do produto é obrigatório")
        String name,

        @NotNull(message = "O preço do produto é obrigatório")
        @Positive(message = "O preço deve ser maior que zero")
        BigDecimal price
) {}