package dev.roggenbuck.tradejournalapi.service;

import dev.roggenbuck.tradejournalapi.model.Trade;
import org.springframework.stereotype.Service;
import dev.roggenbuck.tradejournalapi.repository.TradeRepository;
import java.util.List;

@Service
public class TradeService {
    private final TradeRepository tradeRepository;
    public TradeService(TradeRepository tradeRepository){
        this.tradeRepository = tradeRepository;
    }

    //Create
    public Trade addTrades(Trade trade) {
        return tradeRepository.save(trade);
    }

    //Read
    public List<Trade> findAll() {
        return tradeRepository.findAll();
    }

    //Update
    public Trade updateTrades(int id, Trade updatedtrade) {
        Trade existing = tradeRepository.findById(id).orElseThrow();
        existing.setSymbol(updatedtrade.getSymbol());
        existing.setEntryPrice(updatedtrade.getEntryPrice());
        existing.setExitPrice(updatedtrade.getExitPrice());
        existing.setPnl(updatedtrade.getPnl());
        return tradeRepository.save(existing);
    }

    //Delete
    public void deleteTrades(int id){
        tradeRepository.deleteById(id);
    }
}
