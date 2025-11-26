package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        // TODO: Implement classifyEnergy()

        if (bpms == null || bpms.isEmpty()) {
            throw new IllegalArgumentException("invalid list");
        }

        int sum = 0;
        for (int item: bpms) {
            sum += item;
        }
        
        double avgBPM = (double) sum / bpms.size();

        if (avgBPM >= 140) {
            return "HIGH";
        }
        else if (avgBPM < 100) {
            return "LOW";
        }
        else {
            return "MEDIUM";
        }

    }

    public static boolean isValidTrackTitle(String title) {
        // TODO: Implement isValidTrackTitle()

        if (title == null || title.length() == 0 || title.length() > 30) {
            return false;
        }

        for (int i = 0; i < title.length(); i++) {
            char c = title.charAt(i);
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }

        }

        return true;
            
    }

    public static int normalizeVolume(int volumeDb) {
        // TODO: Implement normalizeVolume()

        if (volumeDb > 100) {
            volumeDb = 100;
        }
        else if (volumeDb < 0) {
            volumeDb = 0;
        }

        return volumeDb;
    }
}
