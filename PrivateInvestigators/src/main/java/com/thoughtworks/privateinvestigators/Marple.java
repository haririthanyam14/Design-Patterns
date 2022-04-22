package com.thoughtworks.privateinvestigators;

public class Marple {
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
        return new StringBuilder("Marple solving crime with every stitch at ").append(location).toString();
    }
}
