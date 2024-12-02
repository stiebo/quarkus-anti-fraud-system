package dev.stiebo.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

public record SuspiciousIpOutDto(
        @Schema(examples = "42")
        Long id,
        @Schema(examples = "192.168.0.1")
        String ip
) {
}
