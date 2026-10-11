package laba;

public class Computer4Test {

    public static void main(String[] args) {

        Processor processor =
                new Processor("Apple M5", 4.5);

        Memory memory =
                new Memory(16, "Unified Memory");

        Monitor monitor =
                new Monitor(14.2, "3024x1964");

        Computer4 computer = new Computer4(
                ComputerBrand.APPLE,
                processor,
                memory,
                monitor
        );

        System.out.println(computer);
    }
}
