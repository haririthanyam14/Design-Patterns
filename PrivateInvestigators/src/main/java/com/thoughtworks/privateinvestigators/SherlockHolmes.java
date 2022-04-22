package com.thoughtworks.privateinvestigators;

public class SherlockHolmes {
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
        return new StringBuilder("Sherlock visualizing things in his mind library at ").append(location).toString();
    }

}
