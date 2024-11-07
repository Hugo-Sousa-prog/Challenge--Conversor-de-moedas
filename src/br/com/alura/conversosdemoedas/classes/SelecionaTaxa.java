package br.com.alura.conversosdemoedas.classes;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class SelecionaTaxa {
    public double getRate(String json, String moeda) {
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
        return conversionRates.get(moeda).getAsDouble();
    }
}
