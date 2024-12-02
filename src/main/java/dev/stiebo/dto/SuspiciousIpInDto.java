package dev.stiebo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

public record SuspiciousIpInDto(
        @NotBlank
        @Pattern(regexp = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$")
        @Schema(examples = "192.168.0.1")
        String ip
) {
}
