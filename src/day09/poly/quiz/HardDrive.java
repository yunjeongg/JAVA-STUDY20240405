package day09.poly.quiz;

public class HardDrive extends ComputerPart {
    public HardDrive(String partName, int partPrice) {
        super(partName, partPrice);
    }

    @Override
    public void describePart() {
        System.out.println("HardDrive: " + partName + ", Price: " + partPrice);
    }
}
