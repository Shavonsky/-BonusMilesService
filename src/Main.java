public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int BonusMilesService = service.calculate(50_000);
        System.out.println(BonusMilesService);

        int BonusMilesService1 = service.calculate(10_000);
        System.out.println(BonusMilesService1);

        int BonusMilesService2 = service.calculate(500_000);
        System.out.println(BonusMilesService2);

        int BonusMilesService3 = service.calculate(1_000_000);
        System.out.println(BonusMilesService3);
    }

}
