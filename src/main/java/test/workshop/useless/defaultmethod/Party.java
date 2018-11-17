package test.workshop.useless.defaultmethod;

public class Party {

    private final Noisable noisable;

    public Party(Noisable noisable) {
        /* Here you need implementation */
        this.noisable = noisable;
    }

    public String makeSomeNoise() {
        return noisable.makeNoise();
    }
}
