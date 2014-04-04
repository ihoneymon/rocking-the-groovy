package kr.pe.ihoney.groovy.study.begin

class Money {
    private int amount
    private String currency

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    /**
     * 재정의된 plus(+) 연산자
     * @param other
     * @return
     */
    Money plus(Money other) {
        assert null != other
        if(other.currency != currency)
            throw new IllegalArgumentException("Cannot add $other.currency to $currency");

        return new Money(amount + other.amount, currency);
    }

    @Override
    public int hashCode() {
        amount.hashCode() + currency.hashCode()
    }

    @Override
    public boolean equals(Object other) {
        if(null == other) return false
        if(!(other instanceof Money)) return false
        if(currency != other.currency) return false
        if(amount != other.amount) return false
        return true
    }
}
