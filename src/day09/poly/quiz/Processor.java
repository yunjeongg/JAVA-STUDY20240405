package day09.poly.quiz;

public class Processor extends ComputerPart {

    public Processor(String partName, int partPrice) {
        super(partName, partPrice);
    }

    @Override
    public void describePart() {
        System.out.println("Processor: " + partName + ", Price: " + partPrice);
    }
}
