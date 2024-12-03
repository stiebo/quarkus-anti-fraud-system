package dev.stiebo.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.LuhnCheck;
import org.eclipse.microprofile.openapi.annotations.media.Schema;


public record StolenCardInDto(
        @NotBlank
        @LuhnCheck
        @Schema(examples = "4000008449433403")
        String number
) {
}
