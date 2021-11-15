package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutAccentsTest {

    @Test
    void testCharacterWithAccents() {
        assertEquals('a', new WithoutAccents().convertToCharWithoutAccents('á'));
        assertEquals('A', new WithoutAccents().convertToCharWithoutAccents('Á'));
        assertEquals('o', new WithoutAccents().convertToCharWithoutAccents('ö'));
        assertEquals('U', new WithoutAccents().convertToCharWithoutAccents('Ú'));
    }

    @Test
    void testCharacterWithoutAccents() {
        assertEquals('e', new WithoutAccents().convertToCharWithoutAccents('e'));
        assertEquals('E', new WithoutAccents().convertToCharWithoutAccents('E'));
        assertEquals('f', new WithoutAccents().convertToCharWithoutAccents('f'));
    }
}
