package schoolrecords;

public class Mark {      //a diák számára adott jegyeket reprezentálja

    private MarkType markType;  // az osztályzat "értéke"
    private Subject subject;    // a tantárgy, amiből kapta a jegyet
    private Tutor tutor;        //a tanár, aki adja a jegyet

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        if (subject == null || tutor == null) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        this.markType = MarkType.valueOf(markType);
        this.subject = subject;
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return markType.getDescription() + "(" + markType.getMark() + ")";
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
