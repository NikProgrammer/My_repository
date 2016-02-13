package ru.nikprogrammer.webapp.model;

/**
 * Nikolay
 * 10.02.2016.
 */
public class Contact {
    private final String type;
    private final String value;

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public Contact(String type, String value) {

        this.type = type;
        this.value = value;
    }
}

