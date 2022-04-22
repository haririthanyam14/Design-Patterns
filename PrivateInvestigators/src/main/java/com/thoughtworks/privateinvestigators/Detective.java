package com.thoughtworks.privateinvestigators;

public interface Detective {
    String investigate();
    void update(String location, String evidence, String witnessInformation);
}
