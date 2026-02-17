package dev.roggenbuck.tradejournalapi.service;

import dev.roggenbuck.tradejournalapi.model.Trade;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import dev.roggenbuck.tradejournalapi.repository.TradeRepository;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TradeService {
    private final TradeRepository tradeRepository;

    public TradeService(TradeRepository tradeRepository) {
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
    public Trade updateTrades(Integer id, Trade updatedtrade) {
        Trade existing = tradeRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Trade with ID " + id + " not found"));
        existing.setSymbol(updatedtrade.getSymbol());
        existing.setEntryPrice(updatedtrade.getEntryPrice());
        existing.setExitPrice(updatedtrade.getExitPrice());
        existing.setPnl(updatedtrade.getPnl());
        return tradeRepository.save(existing);
    }

    //Delete
    public void deleteTrades(Integer id) {
        if (!tradeRepository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Trade with ID " + id + " not found");
        }
        tradeRepository.deleteById(id);
    }
}
