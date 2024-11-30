package dev.stiebo.dto;


import org.eclipse.microprofile.openapi.annotations.media.Schema;

public record StolenCardOutDto(
        @Schema(defaultValue = "42")
        Long id,
        @Schema(defaultValue = "4000008449433403")
        String number
) {
}
