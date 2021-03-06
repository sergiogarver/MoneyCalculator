package moneycalculator.model;

import java.util.Date;

public class ExchangeRate {
    private final Currency from;
    private final Currency to;
    private final Date date;
    private final double rate;

    public ExchangeRate(Currency from, Currency to, Date date,  double rate) {
        this.date = date;
        this.from = from;
        this.to = to;
        this.rate = rate;
    }

    public Date getDate() {
        return date;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public double getRate() {
        return rate;
    }
}