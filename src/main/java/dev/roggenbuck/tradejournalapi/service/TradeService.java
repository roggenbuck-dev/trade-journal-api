package dev.roggenbuck.tradejournalapi.service;

import dev.roggenbuck.tradejournalapi.model.Trade;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TradeService {
    private final List<Trade> trades = new ArrayList<>();

    public TradeService(){
        trades.add(new Trade("NASDAQ", 15000,20000,5000));
        trades.add(new Trade("GOLD", 2030,2045,15));
    }

    public List<Trade> findAll(){
        return trades;
    }
}
