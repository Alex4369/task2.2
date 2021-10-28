public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(100);
        System.out.println(miles);
        int mile = service.calculate(0);
        System.out.println(mile);
        int bonusMiles = service.calculate(19);
        System.out.println(bonusMiles);
        int bonusMile = service.calculate(20);
        System.out.println(bonusMile);
        int bonus = service.calculate(21);
        System.out.println(bonus);
    }
}
