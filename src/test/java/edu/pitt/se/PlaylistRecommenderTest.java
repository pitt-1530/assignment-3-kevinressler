package edu.pitt.se;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PlaylistRecommenderTest {

    @Test
    public void testClassifyEnergy() {
        ArrayList<Integer> testList = new ArrayList<>();

        testList.add(150);
        testList.add(152);
        testList.add(153);
    
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(testList), "Should be high");

        testList.add(5);
        testList.add(6);
        testList.add(7);

        assertEquals("LOW", PlaylistRecommender.classifyEnergy(testList), "Should be low");

    }

    @Test
    public void testIsValidTrackTitle() {

        String title = "thisShouldBeTooLongSoTheTestShouldFail";

        assertFalse(PlaylistRecommender.isValidTrackTitle(title));

        String title2 = "Hello World";
        assertTrue(PlaylistRecommender.isValidTrackTitle(title2));
    }

    @Test
    public void testNormalizeVolume() {

        int vol = -300;
        assertEquals(0, PlaylistRecommender.normalizeVolume(vol));
    }
}
