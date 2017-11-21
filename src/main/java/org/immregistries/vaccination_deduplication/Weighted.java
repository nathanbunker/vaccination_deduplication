package org.immregistries.vaccination_deduplication;

public class Weighted {

    public static final int DEFAULT_MIN_THRESHOLD = 50;
    public static final int DEFAULT_MAX_THRESHOLD = 75;

    public Weighted() {
    }

    public int score(Immunization immunization1, Immunization immunization2, double minThreshold, double maxThreshold) {
        return 0;
    }

    public int score(Immunization immunization1, Immunization immunization2) {
        return score(immunization1, immunization2, DEFAULT_MIN_THRESHOLD, DEFAULT_MAX_THRESHOLD);
    }
}
