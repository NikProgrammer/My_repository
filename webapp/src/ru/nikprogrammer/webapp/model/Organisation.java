package ru.nikprogrammer.webapp.model;

import java.util.List;

/**
 * Nikolay
 * 13.02.2016.
 */
public class Organisation {
    private Link link;

    List<OrganizationPeriod> period;

    public Link getLink() {
        return link;
    }

    public Organisation(Link name) {
        this.link = name;
    }
}
