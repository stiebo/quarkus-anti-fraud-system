package dev.stiebo.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

public record DeleteSuspiciousIpOutDto(
        @Schema(defaultValue = "IP 192.168.0.1 successfully removed!")
        String status
) {
}
