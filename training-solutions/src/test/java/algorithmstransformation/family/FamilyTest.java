package algorithmstransformation.family;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    Family family;

    @BeforeEach
    void setUp() {
        family = new Family();
        family.addFamilyMember(new FamilyMember("Kiss Péter", 34));
        family.addFamilyMember(new FamilyMember("Kovács Jónás", 24));
        family.addFamilyMember(new FamilyMember("Horváth Dénes", 30));
        family.addFamilyMember(new FamilyMember("Nagy Péter", 38));
    }

    @Test
    void testGetAgesOfFamilyMembersWithNameGiven() {
        List<Integer> result = family.getAgesOfFamilyMembersWithNameGiven("Péter");
        assertEquals(2, result.size());
        assertTrue(result.contains(34));
        assertFalse(result.contains(30));
    }
}