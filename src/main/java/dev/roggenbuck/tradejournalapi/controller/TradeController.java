package dev.roggenbuck.tradejournalapi.controller;

import dev.roggenbuck.tradejournalapi.model.Trade;
import dev.roggenbuck.tradejournalapi.service.TradeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TradeController {

    private final TradeService tradeService;

    public TradeController(TradeService tradeService) {
        this.tradeService = tradeService;
    }

    @GetMapping("/trades")
    public List<Trade> trades() {
        return tradeService.findAll();
    }

    @PostMapping("/trades")
    public Trade addTrade(@RequestBody Trade trade) {
        tradeService.addTrades(trade);
        return trade;
    }

    @PutMapping("/trades/{id}")
    public Trade updateTrade(@PathVariable int id, @RequestBody Trade updatedTrade) {
        return tradeService.updateTrades(id, updatedTrade);
    }

    @DeleteMapping("/trades/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrade(@PathVariable int id) {
        tradeService.deleteTrades(id);
    }
}
