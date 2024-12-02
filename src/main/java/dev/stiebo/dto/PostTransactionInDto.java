package dev.stiebo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.hibernate.validator.constraints.LuhnCheck;

import java.time.LocalDateTime;


public record PostTransactionInDto(
        @NotNull
        @Min(value = 1L)
        @Schema(examples = "500")
        Long amount,
        @NotBlank
        @Pattern(regexp = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$")
        @Schema(examples = "192.168.0.1")
        String ip,
        @NotBlank
        @LuhnCheck
        @Schema(examples = "4000008449433403")
        String number,
        @NotBlank
        @Pattern(regexp = "EAP|ECA|HIC|LAC|MENA|SA|SSA")
        String region,
        @NotNull
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
        LocalDateTime date
) {
}
