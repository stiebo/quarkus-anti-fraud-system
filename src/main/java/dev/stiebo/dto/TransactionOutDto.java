package dev.stiebo.dto;


import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.LocalDateTime;

public record TransactionOutDto(
        @Schema(examples = "42")
        Long transactionId,
        @Schema(examples = "234")
        Long amount,
        @Schema(examples = "192.168.1.1")
        String ip,
        @Schema(examples = "4000008449433403")
        String number,
        @Schema(examples = "MENA")
        String region,
        LocalDateTime date,
        @Schema(examples = "MANUAL_PROCESSING")
        String result,
        @Schema(examples = "ALLOWED")
        String feedback
) {
}
