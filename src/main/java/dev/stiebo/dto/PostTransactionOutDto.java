package dev.stiebo.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

public record PostTransactionOutDto(
        @Schema(defaultValue = "PROHIBITED")
        String result,
        @Schema(defaultValue = "amount, ip")
        String info
) {
}
