public class ApplePieRecipe {


    Ingredient butter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient sugar = new Ingredient(200, "gram", "witte basterd suiker");
    Ingredient flower = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient egg = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanilleSugar = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient salt = new Ingredient(1, "snuf", "zout");
    Ingredient apples = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient cristalSugar = new Ingredient(75, "gram", "kristalsuiker");
    Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel");
    Ingredient breadCrums = new Ingredient(15, "gram", "parneermeel");


    public void printIngredients() {
        System.out.println(" APPELTAART ");
        System.out.println("\nVoor dit recept heb je nodig:\n ");
        System.out.println(butter.getAmount() + " " + butter.getUnit() + " " + butter.getName());
        System.out.println(sugar.getAmount() + " " + sugar.getUnit() + " " + sugar.getName());
        System.out.println(flower.getAmount() + " " + flower.getUnit() + " " + flower.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(vanilleSugar.getAmount() + " " + vanilleSugar.getUnit() + " " + vanilleSugar.getName());
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(apples.getAmount() + " " + apples.getUnit() + " " + apples.getName());
        System.out.println(cristalSugar.getAmount() + " " + cristalSugar.getUnit() + " " + cristalSugar.getName());
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println(breadCrums.getAmount() + " " + breadCrums.getUnit() + " " + breadCrums.getName());
    }

    //Maak voor iedere stap een public void  methode aan genaamd step1, step2 enz. Zet vervolgens een System.out.println() in de body van de methode. En laat deze de tekst van de stap uitprinten.

    public void printSteps() {
        System.out.println("\nstappen: ");
        preHeatOven();
        eggDividing();
        mixIngredients();
        applePrep();
        bakingTinPrep();
        dougInBakingTin();
        appleInBakingTin();
        prepTopOfPie();
        bakingPie();
    }



    public void preHeatOven() {
        System.out.println("- Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void eggDividing() {
        System.out.println("- Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void mixIngredients() {
        System.out.println("- Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void applePrep() {
        System.out.println("- Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel. ");
    }

    public void bakingTinPrep() {
        System.out.println("- Vet de springvorm in en bestrooi deze met bloem. ");
    }

    public void dougInBakingTin() {
        System.out.println("- Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op. ");
    }

    public void appleInBakingTin() {
        System.out.println("- Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm. ");
    }

    public void prepTopOfPie() {
        System.out.println("- Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed. ");
    }

    public void topOfPie() {
        System.out.println("- Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken ");
    }

    public void bakingPie() {
        System.out.println("- Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin. ");
    }


}
