package dev.roggenbuck.tradejournalapi.repository;

import dev.roggenbuck.tradejournalapi.model.Trade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradeRepository extends JpaRepository<Trade, Integer> {
}
