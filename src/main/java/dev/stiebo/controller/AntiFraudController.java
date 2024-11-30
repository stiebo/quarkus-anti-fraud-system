package dev.stiebo.controller;

import dev.stiebo.dto.*;
import dev.stiebo.service.AntiFraudService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.LuhnCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api/antifraud")
public class AntiFraudController {
    private final AntiFraudService service;

    @Autowired
    public AntiFraudController(AntiFraudService service) {
        this.service = service;
    }

    @PostMapping("/transaction")
    public PostTransactionOutDto postTransaction(@Valid @RequestBody PostTransactionInDto postTransactionInDto) {
        return service.postTransaction(postTransactionInDto);
    }

    @PutMapping("/transaction")
    public TransactionOutDto uploadTransactionFeedback(@Valid @RequestBody UpdateTransactionFeedback feedback) {
        return service.updateTransactionFeedback(feedback);
    }

    @GetMapping("/history")
    public TransactionOutDto[] getTransactionHistory() {
        return service.getTransactionHistory();
    }

    @GetMapping("/history/{number}")
    public TransactionOutDto[] getTransactionHistoryByNumber(@Valid @PathVariable("number") @LuhnCheck String number) {
        return service.getTransactionHistoryByNumber(number);
    }

    @PostMapping("/suspicious-ip")
    public SuspiciousIpOutDto postSuspiciousIp(@Valid @RequestBody SuspiciousIpInDto suspiciousIPInDto) {
        return service.postSuspiciousIp(suspiciousIPInDto);
    }

//    @Operation(
//            summary = "Remove suspicious IP",
//            description = "Removes an IP address from the suspicious-IP list (Role: SUPPORT)",
//            security = @SecurityRequirement(name = "basicAuth"))
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", description = "Success",
//                    content = @Content(
//                            mediaType = MediaType.APPLICATION_JSON_VALUE,
//                            schema = @Schema(example = "{\"status\":\"IP 192.168.0.1 successfully removed!\"}")
//                    )),
//            @ApiResponse(responseCode = "400", description = "Validation failed for request parameter",
//                    content = @Content(
//                            mediaType = MediaType.APPLICATION_JSON_VALUE,
//                            schema = @Schema(implementation = ValidationErrorResponse.class)
//                    )),
//            @ApiResponse(responseCode = "404", description = "IP not found",
//                    content = @Content(
//                            mediaType = MediaType.APPLICATION_JSON_VALUE,
//                            schema = @Schema(implementation = ErrorResponse.class)
//                    ))
//    })
    @DeleteMapping("/suspicious-ip/{ip}")
    public Map<String, String> deleteSuspiciousIp(
            @PathVariable("ip") @Pattern(regexp = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$") String ip) {
        service.deleteSuspiciousIp(ip);
        return Collections.singletonMap("status", "IP %s successfully removed!".formatted(ip));
    }

//    @Operation(
//            summary = "List suspicious IPs",
//            description = "Retrieves the list of suspicious IP addresses (Role: SUPPORT)",
//            security = @SecurityRequirement(name = "basicAuth"))
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", description = "Success",
//                    content = @Content(
//                            mediaType = MediaType.APPLICATION_JSON_VALUE,
//                            schema = @Schema(implementation = SuspiciousIpOutDto[].class)
//                    ))
//    })
    @GetMapping("/suspicious-ip")
    public SuspiciousIpOutDto[] getSuscipiousIps() {
        return service.getSuspiciousIps();
    }

//    @Operation(
//            summary = "Add stolen card",
//            description = "Adds a card number to the stolen cards list (Role: SUPPORT)",
//            security = @SecurityRequirement(name = "basicAuth"))
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", description = "Success",
//                    content = @Content(
//                            mediaType = MediaType.APPLICATION_JSON_VALUE,
//                            schema = @Schema(implementation = StolenCardOutDto.class)
//                    )),
//            @ApiResponse(responseCode = "400", description = "Validation failed for request parameter",
//                    content = @Content(
//                            mediaType = MediaType.APPLICATION_JSON_VALUE,
//                            schema = @Schema(implementation = ValidationErrorResponse.class)
//                    )),
//            @ApiResponse(responseCode = "409", description = "Stolen card already exists",
//                    content = @Content(
//                            mediaType = MediaType.APPLICATION_JSON_VALUE,
//                            schema = @Schema(implementation = ErrorResponse.class)
//                    ))
//    })
    @PostMapping("/stolencard")
    public StolenCardOutDto postStolenCard(@Valid @RequestBody StolenCardInDto stolenCardInDto) {
        return service.postStolenCard(stolenCardInDto);
    }

//    @Operation(
//            summary = "Remove stolen card",
//            description = "Removes a card number from the stolen cards list (Role: SUPPORT)",
//            security = @SecurityRequirement(name = "basicAuth"))
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", description = "Success",
//                    content = @Content(
//                            mediaType = MediaType.APPLICATION_JSON_VALUE,
//                            schema = @Schema(example = "{\"status\":\"Card 4000008449433403 successfully removed!\"}")
//                    )),
//            @ApiResponse(responseCode = "400", description = "Validation failed for request parameter",
//                    content = @Content(
//                            mediaType = MediaType.APPLICATION_JSON_VALUE,
//                            schema = @Schema(implementation = ValidationErrorResponse.class)
//                    )),
//            @ApiResponse(responseCode = "404", description = "Stolen card not found",
//                    content = @Content(
//                            mediaType = MediaType.APPLICATION_JSON_VALUE,
//                            schema = @Schema(implementation = ErrorResponse.class)
//                    ))
//    })
    @DeleteMapping("/stolencard/{number}")
    public Map<String, String> deleteStolenCard(@PathVariable("number") @LuhnCheck String number) {
        service.deleteStolenCard(number);
        return Collections.singletonMap("status", "Card %s successfully removed!".formatted(number));
    }

//    @Operation(
//            summary = "List stolen cards",
//            description = "Retrieves the list of stolen cards (Role: SUPPORT)",
//            security = @SecurityRequirement(name = "basicAuth"))
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", description = "Success",
//                    content = @Content(
//                            mediaType = MediaType.APPLICATION_JSON_VALUE,
//                            schema = @Schema(implementation = StolenCardOutDto[].class)
//                    ))
//    })
    @GetMapping("/stolencard")
    public StolenCardOutDto[] getStolenCards() {
        return service.getStolenCards();
    }
}
