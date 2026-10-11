package laba;

public class Computer4 {

    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer4(ComputerBrand brand, Processor processor,
                     Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public ComputerBrand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    @Override
    public String toString() {
        return "Компьютер: " + brand
                + "\nПроцессор: " + processor
                + "\nПамять: " + memory
                + "\nМонитор: " + monitor;
    }
}