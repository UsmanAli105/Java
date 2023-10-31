package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

class Address {
    @JsonProperty("#cdata-section")
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
