package dev.roggenbuck.tradejournalapi.controller;

import dev.roggenbuck.tradejournalapi.model.Trade;
import dev.roggenbuck.tradejournalapi.service.TradeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TradeController {

    private final TradeService tradeService;

    public TradeController(TradeService tradeService){
        this.tradeService = tradeService;
    }

    @GetMapping("/trades")
        public List<Trade> trades() {
            return tradeService.findAll();
        }

}
