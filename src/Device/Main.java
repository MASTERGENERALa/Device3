package Device;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Manufacturer 1", 999.99f, "ABC123");
        Device device2 = new Device("Manufacturer 1", 999.99f, "ABC123");

        System.out.println("device1.equals(device2): " + device1.equals(device2));
        System.out.println("device1.hashCode(): " + device1.hashCode());
        System.out.println("device2.hashCode(): " + device2.hashCode());

        Monitor monitor1 = new Monitor("Manufacturer 2", 1499.99f, "DEF456", 1920, 1080);
        Monitor monitor2 = new Monitor("Manufacturer 2", 1499.99f, "DEF456", 1920, 1080);

        System.out.println("monitor1.equals(monitor2): " + monitor1.equals(monitor2));
        System.out.println("monitor1.hashCode(): " + monitor1.hashCode());
        System.out.println("monitor2.hashCode(): " + monitor2.hashCode());

        EthernetAdapter adapter1 = new EthernetAdapter("Manufacturer 3", 99.99f, "GHI789", 1000, "00:11:22:33:44:55");
        EthernetAdapter adapter2 = new EthernetAdapter("Manufacturer 3", 99.99f, "GHI789", 1000, "00:11:22:33:44:55");

        System.out.println("adapter1.equals(adapter2): " + adapter1.equals(adapter2));
        System.out.println("adapter1.hashCode(): " + adapter1.hashCode());
        System.out.println("adapter2.hashCode(): " + adapter2.hashCode());
    }
}
