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
    public Trade() {}

    public Integer getId() { return id; }

    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol){
        this.symbol = symbol;
    }

    public double getEntryPrice() {
        return entryPrice;}
    public void setEntryPrice(double entryPrice) {
        this.entryPrice = entryPrice;}

    public double getExitPrice() {
        return exitPrice;}
    public void setExitPrice(double exitPrice) {
        this.exitPrice = exitPrice;}

    public double getPnl() {
        return pnl;}
    public void setPnl(double pnl) {
        this.pnl = pnl;}
}
