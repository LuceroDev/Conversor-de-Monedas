package com.alura.michallenge;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private Map<String, Double> exchangeRates;

    public CurrencyConverter() {
        exchangeRates = new HashMap<>();
        // Aquí agregas las tasas de cambio
        exchangeRates.put("USD_to_MXN", 18.0); // Dólar a Peso mexicano
        exchangeRates.put("MXN_to_USD", 0.055); // Peso mexicano a Dólar
        exchangeRates.put("USD_to_ARS", 365.0); // Dólar a Peso argentino
        exchangeRates.put("ARS_to_USD", 0.0027); // Peso argentino a Dólar
        exchangeRates.put("USD_to_BRL", 5.25); // Dólar a Real brasileño
        exchangeRates.put("BRL_to_USD", 0.19); // Real brasileño a Dólar
        exchangeRates.put("USD_to_COP", 4400.0); // Dólar a Peso colombiano
        exchangeRates.put("COP_to_USD", 0.00023); // Peso colombiano a Dólar
    }

    public double convertDollarToMexicanPeso(double amount) {
        return amount * exchangeRates.get("USD_to_MXN");
    }

    public double convertMexicanPesoToDollar(double amount) {
        return amount * exchangeRates.get("MXN_to_USD");
    }

    public double convertDollarToArgentinePeso(double amount) {
        return amount * exchangeRates.get("USD_to_ARS");
    }

    public double convertArgentinePesoToDollar(double amount) {
        return amount * exchangeRates.get("ARS_to_USD");
    }

    public double convertDollarToBrazilianReal(double amount) {
        return amount * exchangeRates.get("USD_to_BRL");
    }

    public double convertBrazilianRealToDollar(double amount) {
        return amount * exchangeRates.get("BRL_to_USD");
    }

    public double convertDollarToColombianPeso(double amount) {
        return amount * exchangeRates.get("USD_to_COP");
    }

    public double convertColombianPesoToDollar(double amount) {
        return amount * exchangeRates.get("COP_to_USD");
    }
}
