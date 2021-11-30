package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyMemberTest {

    @Test
    void testCreateFamilyMember() {
        FamilyMember familyMember = new FamilyMember("Kiss Péter", 34);
        assertEquals("Kiss Péter", familyMember.getName());
        assertEquals(34, familyMember.getAge());
    }
}