package com.thoughtworks.privateinvestigators;

public class HerculesPoirot implements Detective{
    private String location;
    private String evidence;
    private String witnessInformation;

    @Override
    public void update(String location, String evidence, String witnessInformation) {
        this.location = location;
        this.evidence = evidence;
        this.witnessInformation = witnessInformation;
        investigate();
    }

    @Override
    public String investigate() {
        return new StringBuilder("Poirot crunching his little grey cells at at ").append(location).toString();
    }
}
