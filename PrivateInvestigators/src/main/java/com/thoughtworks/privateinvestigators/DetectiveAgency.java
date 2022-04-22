package com.thoughtworks.privateinvestigators;

public class DetectiveAgency {
    private String location;
    private String evidence;
    private String witnessInformation;
    private Source source;
    private SherlockHolmes sherlockHolmes;
    private HerculesPoirot herculesPoirot;
    private Marple marple;

    public DetectiveAgency(Source source, SherlockHolmes sherlockHolmes, HerculesPoirot herculesPoirot, Marple marple) {
        this.source = source;
        this.sherlockHolmes = sherlockHolmes;
        this.herculesPoirot = herculesPoirot;
        this.marple = marple;
    }

    public void informationReceived() {
        this.location = source.getLocation();
        this.evidence = source.getEvidence();
        this.witnessInformation = source.getWitnessInformation();

    }
}
