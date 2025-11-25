package edu.pitt.se;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlaylistRecommenderTest {

    @Test
    public void testClassifyEnergy() {
        ArrayList<Integer> testList = new ArrayList<>();

        testList.add(150);
        testList.add(152);
        testList.add(153);
    
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(testList), "Should be high");



    }

    @Test
    public void testIsValidTrackTitle() {

        String title = "thisShouldBeTooLongSoTheTestShouldFail";

        assertFalse(PlaylistRecommender.isValidTrackTitle(title));
    }

    @Test
    public void testNormalizeVolume() {

        int vol = -300;
        assertEquals(0, PlaylistRecommender.normalizeVolume(vol));
    }
}
