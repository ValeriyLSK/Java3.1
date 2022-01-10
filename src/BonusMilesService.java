public class BonusMilesService {
    public int calculate (int cost) {
        int priceForBonus = 20;
        int totalBonusMiles = cost / priceForBonus;
        return totalBonusMiles;
    }
}



