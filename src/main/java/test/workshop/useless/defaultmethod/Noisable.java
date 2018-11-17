package test.workshop.useless.defaultmethod;

public interface Noisable {

    default String makeNoise() {
        return "Unknown noise";
    }
}
