package dev.stiebo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record UploadTransactionFeedbackInDto(
        @NotNull
        Long transactionId,
        @NotBlank
        @Pattern(regexp = "ALLOWED|MANUAL_PROCESSING|PROHIBITED")
        String feedback
) {
}
