public class Main {
    public static void main(String[] args) {

       ApplePieRecipe applePie = new ApplePieRecipe();
        System.out.println("ingredient = " + applePie.roomboter.getName());
        System.out.println("amount = " + applePie.roomboter.getAmount());
        System.out.println(" unit " + applePie.roomboter.getUnit());
        System.out.println( applePie.roomboter.getAmount() +" " +applePie.roomboter.getUnit()+ " "+ applePie.roomboter.getName() );
    }
}