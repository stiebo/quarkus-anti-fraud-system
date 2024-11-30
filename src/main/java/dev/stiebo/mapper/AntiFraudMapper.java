package dev.stiebo.mapper;

import dev.stiebo.domain.StolenCard;
import dev.stiebo.domain.SuspiciousIp;
import dev.stiebo.domain.Transaction;
import dev.stiebo.dto.*;
import org.springframework.stereotype.Component;

@Component
public class AntiFraudMapper {
    public Transaction toTransaction(PostTransactionInDto postTransactionInDto) {
        return new Transaction()
                .setAmount(postTransactionInDto.amount())
                .setIp(postTransactionInDto.ip())
                .setNumber(postTransactionInDto.number())
                .setRegion(postTransactionInDto.region())
                .setDate(postTransactionInDto.date());
    }

    public TransactionOutDto toDto(Transaction transaction) {
        return new TransactionOutDto(
                transaction.getId(),
                transaction.getAmount(),
                transaction.getIp(),
                transaction.getNumber(),
                transaction.getRegion(),
                transaction.getDate(),
                transaction.getResult(),
                transaction.getFeedback());
    }

    public SuspiciousIp toSuspisiousIp(SuspiciousIpInDto suspiciousIPInDto) {
        return new SuspiciousIp()
                .setIp(suspiciousIPInDto.ip());
    }

    public SuspiciousIpOutDto toDto(SuspiciousIp suspiciousIP) {
        return new SuspiciousIpOutDto(suspiciousIP.getId(), suspiciousIP.getIp());
    }

    public StolenCard toStolenCard(StolenCardInDto stolenCardInDto) {
        return new StolenCard()
                .setNumber(stolenCardInDto.number());
    }

    public StolenCardOutDto toDto (StolenCard stolenCard) {
        return new StolenCardOutDto(stolenCard.getId(), stolenCard.getNumber());
    }
}
