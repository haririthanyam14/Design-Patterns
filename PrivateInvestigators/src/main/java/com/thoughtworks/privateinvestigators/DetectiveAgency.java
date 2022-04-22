package com.thoughtworks.privateinvestigators;

public class DetectiveAgency {
    private String location;
    private String evidence;
    private String witnessInformation;
    private Source source;
    private Detective sherlockHolmes;
    private Detective herculesPoirot;
    private Detective marple;

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

        sherlockHolmes.update(location, evidence, witnessInformation);
        herculesPoirot.update(location, evidence, witnessInformation);
        marple.update(location, evidence, witnessInformation);
    }
}
