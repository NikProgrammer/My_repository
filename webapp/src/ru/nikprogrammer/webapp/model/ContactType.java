package ru.nikprogrammer.webapp.model;

/**
 * Nikolay
 * 16.02.2016.
 */
public enum ContactType {
    PHONE("Тел."),
    MOBILE("Мобильный."),
    SKYPE("Skype."),
    HOME_PHONE("Домашний тел.."),
    MAIL("Электронная почта.");
    private String title;

    public String getTitle() {
        return title;
    }

    ContactType(String title) {

        this.title = title;
    }
}
