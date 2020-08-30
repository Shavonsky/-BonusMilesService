public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int bonusMilesService = service.calculate(50_000);
        System.out.println(bonusMilesService);

        int bonusMilesService1 = service.calculate(10_000);
        System.out.println(bonusMilesService1);

        int bonusMilesService2 = service.calculate(500_000);
        System.out.println(bonusMilesService2);

        int bonusMilesService3 = service.calculate(1_000_000);
        System.out.println(bonusMilesService3);
    }

}
