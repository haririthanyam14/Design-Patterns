package com.thoughtworks.privateinvestigators;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class DetectiveAgencyTest {

    SherlockHolmes sherlockHolmes = mock(SherlockHolmes.class);
    HerculesPoirot herculesPoirot = mock(HerculesPoirot.class);
    Marple marple = mock(Marple.class);

    @Test
    public void shouldInvestigate() {
        String location = "East Hallway Road";
        String evidence = "A blade with stains";
        String witnessInformation = "No witness";
        Source source = new Source(location, evidence, witnessInformation);
        DetectiveAgency detectiveAgency = new DetectiveAgency(source, sherlockHolmes,herculesPoirot, marple);
        detectiveAgency.informationReceived();

        verify(sherlockHolmes, times(1)).update(location, evidence, witnessInformation);
        verify(herculesPoirot, times(1)).update(location, evidence, witnessInformation);
        verify(marple, times(1)).update(location, evidence, witnessInformation);
    }
}
