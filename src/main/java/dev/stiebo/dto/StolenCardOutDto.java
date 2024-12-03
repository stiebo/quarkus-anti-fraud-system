package dev.stiebo.dto;


import org.eclipse.microprofile.openapi.annotations.media.Schema;

public record StolenCardOutDto(
        @Schema(examples = "42")
        Long id,
        @Schema(examples = "4000008449433403")
        String number
) {
}
