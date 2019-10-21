package com.srgms.moneymate.model.currency;

public enum Currency {
    EUR("EUR", "Euro"),
    USD("USD", "US Dollar"),
    YEN("YEN", "Yen");

    private String code;
    private String description;

    Currency(String code, String description) {
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.getCode();
    }
}

/*
public class Currency {

    public static final Currency EUR = new Currency("EUR", "Euro");
    public static final Currency USD = new Currency("USD", "US Dollar");
    public static final Currency YEN = new Currency("YEN", "Yen");

    private String code;
    private String description;

    public Currency(
        String code,
        String description
    ) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
*/
