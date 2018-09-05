package com.example.forexservice.controller;

import com.example.forexservice.domain.ExchangeValue;
import com.example.forexservice.repository.ExchangeValueRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForexController {

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository repository;

    @GetMapping("currency-exchange/from/{from}/to/{to}")
    public ResponseEntity<ExchangeValue> getExchangeValue(@PathVariable("from") String from,
                                                          @PathVariable("to") String to){
        val exchangeValueOptional = repository.findByFromCurrencyAndToCurrency(from,to);
        if(exchangeValueOptional.isPresent()) {
            ExchangeValue exchangeValue = exchangeValueOptional.get();
            exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
            return ResponseEntity.ok(exchangeValueOptional.get());
        }
        else
            return ResponseEntity.noContent().build();
    }

}
