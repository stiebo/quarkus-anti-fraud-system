package dev.stiebo.service;

import dev.stiebo.dto.*;

public interface AntiFraudService {
    PostTransactionOutDto postTransaction(PostTransactionInDto postTransactionInDto);

    TransactionOutDto updateTransactionFeedback(UploadTransactionFeedbackInDto feedback);

    TransactionOutDto[] getTransactionHistory();

    TransactionOutDto[] getTransactionHistoryByNumber(String number);

    SuspiciousIpOutDto postSuspiciousIp(SuspiciousIpInDto suspiciousIpInDto);

    void deleteSuspiciousIp(String ip);

    SuspiciousIpOutDto[] getSuspiciousIps();

    StolenCardOutDto postStolenCard(StolenCardInDto stolenCardInDto);

    void deleteStolenCard(String number);

    StolenCardOutDto[] getStolenCards();
}
