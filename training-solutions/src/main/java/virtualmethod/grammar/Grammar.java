package virtualmethod.grammar;

public class Grammar {

    public static void main(String[] args) {

        Verb firstVerb = new PhrasalVerb("fordul", "le");
        Verb secondVerb = new PhrasalVerbWithSuffix("fordul", "le", "t");

        System.out.println(firstVerb.getWord());
        System.out.println(secondVerb.getWord());

        Preposition firstPreposition = new PhrasalVerb("fordul", "le");
        Preposition secondPreposition = new PhrasalVerbWithSuffix("fordul", "le", "t");

        System.out.println(firstPreposition.getPreposition());
        System.out.println(firstPreposition.getWholeWord());

        System.out.println(secondPreposition.getPreposition());
        System.out.println(secondPreposition.getWholeWord());

        PhrasalVerb firstPhrasalVerb = new PhrasalVerb("fordul", "le");
        PhrasalVerb secondPhrasalVerb = new PhrasalVerbWithSuffix("fordul", "le", "t");

        System.out.println(firstPhrasalVerb.getWord());
        System.out.println(firstPhrasalVerb.getPreposition());
        System.out.println(firstPhrasalVerb.getWholeWord());

        System.out.println(firstPhrasalVerb.getWord());
        System.out.println(secondPhrasalVerb.getPreposition());
        System.out.println(secondPhrasalVerb.getWholeWord());

        Suffix suffix = new PhrasalVerbWithSuffix("fordul", "le", "t");

        System.out.println(suffix.getSuffix());

        PhrasalVerbWithSuffix phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("fordul", "le", "t");

        System.out.println(phrasalVerbWithSuffix.getWord());
        System.out.println(phrasalVerbWithSuffix.getPreposition());
        System.out.println(phrasalVerbWithSuffix.getSuffix());
        System.out.println(phrasalVerbWithSuffix.getWholeWord());
    }
}
