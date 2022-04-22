package com.thoughtworks.privateinvestigators;

public class SherlockHolmes implements Detective {
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
        return new StringBuilder("Sherlock visualizing things in his mind library at ").append(location).toString();
    }

}
