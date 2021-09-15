public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticket = 32000;
        int miles = service.calculate(ticket);
        System.out.println(miles);
    //  public static void main(String[] args) {
    //     int ticket = 32000;
    // переменная a= 1 мили
    //    int a = 20;
    //    int miles = ticket / a;
    //    System.out.println(miles);
}
}
