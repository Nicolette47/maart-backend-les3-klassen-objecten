public class LeekCookies {
Ingredient leek = new Ingredient(2, "stengels", "prei");
Ingredient union = new Ingredient(1,  "stuk" , "ui");
Ingredient eggLeekCookies = new Ingredient(4, "stuks", "eieren");
Ingredient flowerLeekCookies = new Ingredient(6, "theelepels", "bloem");
Ingredient thyme = new Ingredient(1, "eetlepel", "tijm");
Ingredient salt = new Ingredient(1, "snufje", "zout");
Ingredient pepper = new Ingredient(1, "snufje", "peper");


public void printIngredientsList(){
    System.out.println("\nPREIKOEKJES" );
    System.out.println("\nVoor dit recept heb je nodig:\n ");
    System.out.println(leek.getAmount() + " " + leek.getUnit() + " " + leek.getName());
    System.out.println(union.getAmount() + " " + union.getUnit() + " " + union.getName());
    System.out.println(eggLeekCookies.getAmount() + " " + eggLeekCookies.getUnit() + " " + eggLeekCookies.getName());
    System.out.println(flowerLeekCookies.getAmount() + " " + flowerLeekCookies.getUnit() + " " + flowerLeekCookies.getName());
    System.out.println(thyme.getAmount() + " " + thyme.getUnit() + " " + thyme.getName());
    System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
    System.out.println(pepper.getAmount() + " " + pepper.getUnit() + " " + pepper.getName());
}

public void printLeekrecipe(){
    System.out.println("\nstappen: ");
    cutLeek();
    cutUnions();
    mixAllIngredients();
    heatOil();
    spoonCookie1();
    spoonCookierest();
    bakingCookies();
    whenCookieReady();
    alongCookies();
}




public void cutLeek() {
        System.out.println("- Snij de prei in kleine stukjes" );
    }

    public void cutUnions() {
        System.out.println("- Snij de uien in kleine stukjes" );
    }

    public void mixAllIngredients() {
        System.out.println("- Meng de prei en ui met de eieren, bloem, tijm, zout en peper" );
    }

    public void heatOil() {
        System.out.println("- Verwarm de pan en giet beetje olie erin." );
    }

    public void spoonCookie1() {
        System.out.println("- Als olie warm is, pak lepel en neem een schep uit kom met de prei-ui-ei mix. Doe dit in de pan, maak een klein rondje ervan." );
    }

    public void spoonCookierest() {
        System.out.println("- Doe dat nog 3x. Bak zo 3 tot 4 koekjes tegelijk" );
    }

    public void bakingCookies() {
        System.out.println("- Bak 1 kant zo´n 2 tot 3 minuten. Draai dan om." );
    }

    public void whenCookieReady() {
        System.out.println("- Koekjes zijn klaar als ze mooi bruin zijn. " );
    }

    public void alongCookies() {
        System.out.println("- Serveer met stukje vlees en (zoete) aardappel." );
    }


}

