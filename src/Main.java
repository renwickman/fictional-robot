public class Main {
    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey.batteryLevel);
        System.out.println(codey.toString());
        codey.performTask("Cleaning");
        codey.performTask("Typing");
        codey.performTask("Dancing");
        codey.performTask("Reading");
        System.out.println(codey.toString());
        System.out.println(codey.batteryLevel);
        codey.energyReport();
    }
}