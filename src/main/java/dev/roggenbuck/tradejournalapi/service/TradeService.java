package dev.roggenbuck.tradejournalapi.service;

import dev.roggenbuck.tradejournalapi.model.Trade;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;


@Service
public class TradeService {
    //Save Data
    private final List<Trade> trades = new ArrayList<>();
    private int nextId = 1;

    //Create
    public Trade addTrades(Trade trade) {
        trade.setId(nextId);
        nextId++;
        trades.add(trade);
        return trade;
    }

    //Read
    public List<Trade> findAll() {
        return trades;
    }

    //Update
    public Trade updateTrades(int id, Trade updatedtrade) {
        Trade existing = findById(id);
        existing.setSymbol(updatedtrade.getSymbol());
        existing.setEntryPrice(updatedtrade.getEntryPrice());
        existing.setExitPrice(updatedtrade.getExitPrice());
        existing.setPnl(updatedtrade.getPnl());
        return existing;
    }

    //Delete
    public void deleteTrades(int id){
        Trade deletedTrade = findById(id);
        trades.remove(deletedTrade);
    }

    public Trade findById(int id) {
        for (Trade t : trades) {
            if (t.getId() == id) {
                return t;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Trade with id " + id + " not found");
    }
}
