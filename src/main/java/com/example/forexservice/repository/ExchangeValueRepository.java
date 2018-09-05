package com.example.forexservice.repository;

import com.example.forexservice.domain.ExchangeValue;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ExchangeValueRepository extends CrudRepository<ExchangeValue,Long> {
    Optional<ExchangeValue> findByFromCurrencyAndToCurrency(String from, String to);
}
