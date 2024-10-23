
    public class Droid {

        int batteryLevel;
        String name;

        public Droid(String droidName) {
            batteryLevel = 100;
            name = droidName;
        }

        public String toString() {
            return "Hello, I'm the droid " + name;
        }

        public void performTask(String task) {
            batteryLevel -= 10;
            System.out.println(name + " is performing task: " + task);
        }

        public void energyReport() {
            System.out.println(name + " has an energy level of: " + batteryLevel);
        }
    }



