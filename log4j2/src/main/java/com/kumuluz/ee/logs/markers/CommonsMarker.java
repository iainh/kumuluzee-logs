/**
 * Copyright (c) Sunesis d.o.o.
 */
package com.kumuluz.ee.logs.markers;

/**
 * @author Rok Povse, Marko Skrjanec
 */
public enum CommonsMarker implements Marker {
    METHOD("METHOD"), RESOURCE("RESOURCE");

    private String marker;

    private CommonsMarker(String marker) {
        this.marker = marker;
    }

    public String toString() {
        return marker;
    }
}
