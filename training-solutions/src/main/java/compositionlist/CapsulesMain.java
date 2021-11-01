package compositionlist;

public class CapsulesMain {

    public static void main(String[] args) {

        Capsules capsules = new Capsules();

        capsules.addLast("blue");
        capsules.addLast("red");
        capsules.addLast("brown");
        capsules.addLast("green");
        capsules.addFirst("yellow");
        System.out.println(capsules.getColors());

        capsules.removeFirst();
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }
}
