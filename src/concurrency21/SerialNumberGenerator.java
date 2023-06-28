package concurrency21; // : concurrency21/SerialNumberGenerator.java

public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    public static int nextSerialNumber() {
        return serialNumber++; // Not thread-safe
    }
} /// :~
