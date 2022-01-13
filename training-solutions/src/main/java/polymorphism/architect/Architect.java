package polymorphism.architect;

public class Architect {

    public static void main(String[] args) {

        Plan firstPlan = new SketchPlan(65, "Nyaraló");
        Plan secondPlan = new PermitPlan(65, "Nyaraló", "Ferenc Imre", "6000 Kecskemét, Békés utca 12");
        Plan thirdPlan = new ConstructionPlan(65, "Nyaraló", "Ferenc Imre", "6000 Kecskemét, Békés utca 12", 50);

        System.out.println(firstPlan.getPagesOfDocumentation());
        System.out.println(secondPlan.getPagesOfDocumentation());
        System.out.println(thirdPlan.getPagesOfDocumentation());

        SketchPlan firstSketchPlan = new SketchPlan(65, "Nyaraló");
        SketchPlan secondSketchPlan = new PermitPlan(65, "Nyaraló", "Ferenc Imre", "6000 Kecskemét, Békés utca 12");
        SketchPlan thirdSketchPlan = new ConstructionPlan(65, "Nyaraló", "Ferenc Imre", "6000 Kecskemét, Békés utca 12", 50);

        System.out.println(firstSketchPlan.getPagesOfDocumentation());
        System.out.println(firstSketchPlan.getTitle());

        System.out.println(secondSketchPlan.getPagesOfDocumentation());
        System.out.println(secondSketchPlan.getTitle());

        System.out.println(thirdSketchPlan.getPagesOfDocumentation());
        System.out.println(thirdSketchPlan.getTitle());

        Header firstHeader = new PermitPlan(65, "Nyaraló", "Ferenc Imre", "6000 Kecskemét, Békés utca 12");
        Header secondHeader = new ConstructionPlan(65, "Nyaraló", "Ferenc Imre", "6000 Kecskemét, Békés utca 12", 50);

        System.out.println(firstHeader.getNameOfClient());
        System.out.println(firstHeader.getAddressOfBuilding());

        System.out.println(secondHeader.getNameOfClient());
        System.out.println(secondHeader.getAddressOfBuilding());

        PermitPlan firstPermitPlan = new PermitPlan(65, "Nyaraló", "Ferenc Imre", "6000 Kecskemét, Békés utca 12");
        PermitPlan secondPermitPlan = new ConstructionPlan(65, "Nyaraló", "Ferenc Imre", "6000 Kecskemét, Békés utca 12", 50);

        System.out.println(firstPermitPlan.getPagesOfDocumentation());
        System.out.println(firstPermitPlan.getTitle());
        System.out.println(firstPermitPlan.getHeader());
        System.out.println(firstPermitPlan.getNameOfClient());
        System.out.println(firstPermitPlan.getAddressOfBuilding());

        System.out.println(secondPermitPlan.getPagesOfDocumentation());
        System.out.println(secondPermitPlan.getTitle());
        System.out.println(secondPermitPlan.getHeader());
        System.out.println(secondPermitPlan.getNameOfClient());
        System.out.println(secondPermitPlan.getAddressOfBuilding());

        ConstructionPlan constructionPlan = new ConstructionPlan(65, "Nyaraló", "Ferenc Imre", "6000 Kecskemét, Békés utca 12", 50);

        System.out.println(constructionPlan.getSheetsOfConstructionDrawings());
        System.out.println(constructionPlan.getPagesOfDocumentation());
        System.out.println(constructionPlan.getTitle());
        System.out.println(constructionPlan.getHeader());
        System.out.println(constructionPlan.getNameOfClient());
        System.out.println(constructionPlan.getAddressOfBuilding());
    }
}
