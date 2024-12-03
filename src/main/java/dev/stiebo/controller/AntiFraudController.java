package dev.stiebo.controller;

import dev.stiebo.dto.*;
import dev.stiebo.service.AntiFraudService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.LuhnCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public TransactionOutDto uploadTransactionFeedback(@Valid @RequestBody UploadTransactionFeedbackInDto feedback) {
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

    @DeleteMapping("/suspicious-ip/{ip}")
    public DeleteSuspiciousIpOutDto deleteSuspiciousIp(
            @PathVariable("ip") @Pattern(regexp = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$") String ip) {
        service.deleteSuspiciousIp(ip);
        return new DeleteSuspiciousIpOutDto("IP %s successfully removed!".formatted(ip));
    }

    @GetMapping("/suspicious-ip")
    public SuspiciousIpOutDto[] getSuscipiousIps() {
        return service.getSuspiciousIps();
    }

    @PostMapping("/stolencard")
    public StolenCardOutDto postStolenCard(@Valid @RequestBody StolenCardInDto stolenCardInDto) {
        return service.postStolenCard(stolenCardInDto);
    }

    @DeleteMapping("/stolencard/{number}")
    public DeleteStolenCardOutDto deleteStolenCard(@PathVariable("number") @LuhnCheck String number) {
        service.deleteStolenCard(number);
        return new DeleteStolenCardOutDto("Card %s successfully removed!".formatted(number));
    }

    @GetMapping("/stolencard")
    public StolenCardOutDto[] getStolenCards() {
        return service.getStolenCards();
    }
}
