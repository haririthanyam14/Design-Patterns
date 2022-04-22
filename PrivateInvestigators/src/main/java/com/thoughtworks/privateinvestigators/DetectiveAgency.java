package com.thoughtworks.privateinvestigators;

import java.util.ArrayList;
import java.util.List;

public class DetectiveAgency {
    private String location;
    private String evidence;
    private String witnessInformation;
    private Source source;
    private List<Detective> detectives;


    public DetectiveAgency(Source source) {
        this.source = source;
        detectives = new ArrayList<Detective>();
    }

    public void register(Detective detective) {
        detectives.add(detective);
    }

    public void remove(Detective detective) {
        detectives.remove(detective);
    }

    public void notifyDetectives() {
        for (Detective detective : detectives) {
            detective.update(location, evidence, witnessInformation);
        }
    }

    public void informationReceived() {
        this.location = source.getLocation();
        this.evidence = source.getEvidence();
        this.witnessInformation = source.getWitnessInformation();
        notifyDetectives();
    }
}