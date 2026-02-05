package dev.roggenbuck.tradejournalapi.model;

public class Trade {
    private String symbol;
    private double entryPrice;
    private double exitPrice;
    private double pnl;

    public Trade(String symbol, double entryPrice, double exitPrice, double pnl){
        this.symbol = symbol;
        this.entryPrice = entryPrice;
        this.exitPrice = exitPrice;
        this.pnl = pnl;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getEntryPrice() {
        return entryPrice;
    }

    public double getExitPrice() {
        return exitPrice;
    }

    public double getPnl() {
        return pnl;
    }
}
