package com.srgms.moneymate.model.util;

import com.univocity.parsers.conversions.Conversion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateConverter implements Conversion<String, LocalDate> {

    private DateTimeFormatter formatter;

    public LocalDateConverter(String... args) {
        String pattern = "dd-MM-yyyy";
        if(args.length > 0){
            pattern = args[0];
        }
        this.formatter = DateTimeFormatter.ofPattern(pattern);
    }

    @Override
    public LocalDate execute(String input) {
        return LocalDate.parse(input, formatter);
    }

    @Override
    public String revert(LocalDate input) {
        return formatter.format(input);
    }
}
