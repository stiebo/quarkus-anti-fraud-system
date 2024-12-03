package dev.stiebo.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

public record PostTransactionOutDto(
        @Schema(examples = "PROHIBITED")
        String result,
        @Schema(examples = "amount, ip")
        String info
) {
}
