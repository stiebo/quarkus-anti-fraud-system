package dev.stiebo.repository;

import dev.stiebo.domain.TransactionLimit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionLimitRepository extends JpaRepository<TransactionLimit,Long> {
}
