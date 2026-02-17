package dev.roggenbuck.tradejournalapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "trades")
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String symbol;
    private double entryPrice;
    private double exitPrice;
    private double pnl;

    // leerer Konstruktor für Spring/Jackson (JSON in Objekt übersetzen)
    public Trade(){}

    public Trade(Integer id,String symbol, double entryPrice, double exitPrice, double pnl){
        this.id = id;
        this.symbol = symbol;
        this.entryPrice = entryPrice;
        this.exitPrice = exitPrice;
        this.pnl = pnl;
    }

    public Integer getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol){
        this.symbol = symbol;
    }

    public double getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(double entryPrice) {
        this.entryPrice = entryPrice;
    }

    public double getExitPrice() {
        return exitPrice;
    }

    public void setExitPrice(double exitPrice) {
        this.exitPrice = exitPrice;
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }
}
