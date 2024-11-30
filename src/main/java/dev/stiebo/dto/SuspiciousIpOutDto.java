package dev.stiebo.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

public record SuspiciousIpOutDto(
        @Schema(defaultValue = "42")
        Long id,
        @Schema(defaultValue = "192.168.0.1")
        String ip
) {
}
