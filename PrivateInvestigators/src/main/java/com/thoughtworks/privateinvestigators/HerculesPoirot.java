package com.thoughtworks.privateinvestigators;

public class HerculesPoirot {
    private String location;
    private String evidence;
    private String witnessInformation;

    public void update(String location, String evidence, String witnessInformation) {
        this.location = location;
        this.evidence = evidence;
        this.witnessInformation = witnessInformation;
        investigate();
    }

    public String investigate() {
        return new StringBuilder("Poirot crunching his little grey cells at at ").append(location).toString();
    }
}
