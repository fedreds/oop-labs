package it.unibo.encapsulation;

public class Smartphone {

    private static final boolean DEF_HAS_GPS = true;
    private static final boolean DEF_HAS_3G = true;
    private static final boolean DEF_HAS_NFC = true;
    private static final int DEF_SD_SIZE = 65536;
    private static final int DEF_RAM_SIZE = 8192;
    private static final int DEF_N_CPU = 8;

    private final int cpuCount;
    private final int ram;
    private final int sdSize;
    private final String brand;
    private final String model;
    private final boolean hasGPS;
    private final boolean has3G;
    private final boolean hasNFC;

    public Smartphone(
        final int cpuCount,
        final int ram,
        final int sdSize,
        final String brand,
        final String model,
        final boolean hasGPS,
        final boolean has3G,
        final boolean hasNFC
    ) {
        this.cpuCount = cpuCount;
        this.ram = ram;
        this.sdSize = sdSize;
        this.brand = brand;
        this.model = model;
        this.hasGPS = hasGPS;
        this.has3G = has3G;
        this.hasNFC = hasNFC;
    }

    public Smartphone(final String brand, final String model) {
        this(brand, model, DEF_SD_SIZE);
    }

    public Smartphone(final String brand, final String model, final int sdSize) {
        this(DEF_N_CPU, DEF_RAM_SIZE, sdSize, brand, model, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }

    public Smartphone(final String brand, final String model, final boolean hasNFC) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, DEF_HAS_GPS, DEF_HAS_3G, hasNFC);
    }

    public Smartphone(final String brand, final String model, final boolean hasGPS, final boolean has3G) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, hasGPS, has3G, DEF_HAS_NFC);
    }

    public int getCpuCount() {
        return this.cpuCount;
    }

    public int getRam() {
        return this.ram;
    }

    public int getSdSize() {
        return this.sdSize;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public boolean getHasGPS() {
        return this.hasGPS;
    }

    public boolean getHas3G() {
        return this.has3G;
    }
    
    public boolean getHasNFC() {
        return this.hasNFC;
    }


    public void printStringRep() {
        IO.println("n CPU(s): " + getCpuCount());
        IO.println("RAM amount: " + getRam());
        IO.println("SD size: " + getSdSize());
        IO.println("brand: " + getBrand());
        IO.println("model: " + getModel());
        IO.println("hasGPS: " + getHasGPS());
        IO.println("has3G: " + getHas3G());
        IO.println("hasNFC: " + getHasNFC() + "\n");
    }

    public static void main() {
        // 1) Creare lo smarthpone HTC One sdSize:1024
        final Smartphone htcOne = new Smartphone("HTC", "One", 1024);
        // 2) Creare lo smarthpone Samsung Galaxy Note 3 ram:2048 cpu:4
        // sdSize:8192 gps:true nfc:true 3g:true
        final Smartphone note3 = new Smartphone(4, 2048, 8192, "Samsung", "Galaxy Note 3", true, true, true);
        // 3) Creare lo smarthpone Apple iPhone 5S nfc:false
        final Smartphone iPhone5S = new Smartphone("Apple", "iPhone 5S", false);
        // 4) Creare lo smarthpone Google Nexus 4 gps:true 3g:true
        final Smartphone nexus4 = new Smartphone("Google", "Nexus 4", true, true);
        // 5) Utilizzare il metodo printStringRep per stampare in standard
        // output le informazioni di ciascun telefono
        htcOne.printStringRep();
        note3.printStringRep();
        iPhone5S.printStringRep();
        nexus4.printStringRep();
    }
}
