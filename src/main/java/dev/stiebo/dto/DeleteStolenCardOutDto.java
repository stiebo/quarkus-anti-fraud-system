package dev.stiebo.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

public record DeleteStolenCardOutDto(
        @Schema(defaultValue = "Card 4000008449433403 successfully removed!")
        String status
) {
}
