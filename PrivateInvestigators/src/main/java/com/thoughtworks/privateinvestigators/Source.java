package com.thoughtworks.privateinvestigators;

public class Source {
    private String location;
    private String evidence;
    private String witnessInformation;

    public Source(String location, String evidence, String witnessInformation) {
        this.location = location;
        this.evidence = evidence;
        this.witnessInformation = witnessInformation;
    }

    public String getLocation() {
        return location;
    }

    public String getEvidence() {
        return evidence;
    }

    public String getWitnessInformation() {
        return witnessInformation;
    }
}
