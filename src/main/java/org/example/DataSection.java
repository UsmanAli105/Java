package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataSection {
    @JsonProperty("#cdata-section")
    private String dataSection;
    public String getDataSection() {
        return dataSection;
    }
    public void setDataSection(String dataSection) {
        this.dataSection = dataSection;
    }
}
