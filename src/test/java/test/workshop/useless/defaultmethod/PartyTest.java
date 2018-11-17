package test.workshop.useless.defaultmethod;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PartyTest {

    @Test
    public void partyMakesUnknownNoise_When_DefaultNoisable() {
        Party party = new Party(new Noisable() {});
        assertEquals(party.makeSomeNoise(), "Unknown noise");
    }
}