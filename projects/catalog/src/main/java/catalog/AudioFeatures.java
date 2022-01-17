package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {      // egy katalóguselemet jellemez, ha az audio tulajdonságokkal rendelkezik
                                                     //  ilyen a zenei album és a hangoskönyv
    private String title;               // audio elem címe
    private int length;                 // hossza
    private List<String> performers = new ArrayList<>();    // előadói
    private List<String> composer = new ArrayList<>();      // szerzői

    public AudioFeatures(String title, int length, List<String> performers) {
        validateTitle(title);
        validateLength(length);
        validatePerformers(performers);
        this.title = title;
        this.length = length;
        this.performers = performers;
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        validateTitle(title);
        validateLength(length);
        validatePerformers(performers);
        validateComposer(composer);
        this.title = title;
        this.length = length;
        this.performers = performers;
        this.composer = composer;
    }

    @Override
    public List<String> getContributors() {      // szerzők és előadók közös listájával tér vissza
        List<String> contributors = new ArrayList<>();
        if (Validators.isEmpty(composer)) {
            contributors.addAll(performers);
        }
        if (!Validators.isEmpty(performers) && !Validators.isEmpty(composer)) {
            contributors.addAll(composer);
            contributors.addAll(performers);
        }
        return contributors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    private void validateTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
    }

    private void validateLength(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Invalid length");
        }
    }

    private void validatePerformers(List<String> performers) {
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("List of performers is empty.");
        }
    }

    private void validateComposer(List<String> composer) {
        if (Validators.isEmpty(composer)) {
            throw new IllegalArgumentException("List of composer is empty.");
        }
    }
}
