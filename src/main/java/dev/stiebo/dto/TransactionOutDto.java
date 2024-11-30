package dev.stiebo.dto;


import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.LocalDateTime;

public record TransactionOutDto(
        @Schema(defaultValue = "42")
        Long transactionId,
        @Schema(defaultValue = "234")
        Long amount,
        @Schema(defaultValue = "192.168.1.1")
        String ip,
        @Schema(defaultValue = "4000008449433403")
        String number,
        @Schema(defaultValue = "MENA")
        String region,
        LocalDateTime date,
        @Schema(defaultValue = "MANUAL_PROCESSING")
        String result,
        @Schema(defaultValue = "")
        String feedback
) {
}
