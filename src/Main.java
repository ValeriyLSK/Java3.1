public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost;
        int miles = service.calculate(cost = 79);
        System.out.println(miles);
    }
}







//public class Main {
//    public static void main(String[] args) {
//
//        int ticketPrice = 60;
//        int priceForBonus = 20;
//        int totalBonusMiles = ticketPrice / priceForBonus;
//        System.out.println("Начислено бонусных миль: " + totalBonusMiles);
//    }
//
//}