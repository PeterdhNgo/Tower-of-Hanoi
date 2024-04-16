import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of disk:\n>");
        int numDisks = scanner.nextInt(); // Change this to change the number of disks that you want to use
        Rod source = new Rod();
        source.setName("Source");

        Rod auxiliary = new Rod();
        auxiliary.setName("Auxiliary");

        Rod destination = new Rod();
        destination.setName("Destination");

        // Initialize disks on the source rod
        for (int i = numDisks; i > 0; i--) {
            Disk disk = new Disk();
            disk.setSizeOfDisk(i);
            source.addDisk(disk);
        }

        // Solve Tower of Hanoi problem recursively
        moveDisks(numDisks, source, destination, auxiliary);
    }

    private static void moveDisks(int numDisks, Rod source, Rod destination, Rod auxiliary) {
        if (numDisks == 0)
        {
            return; // If there are no disks to move, the method returns, which means the end of the recursion
        }

        moveDisks(numDisks - 1, source, auxiliary, destination); // Move everything except from the bottom disk from the source rod to the auxiliary rod
        Disk topDisk = source.getDisks().remove(source.getDisks().size() - 1); // Uses remove() method to remove the disk on the last index
        destination.addDisk(topDisk); // Adds the removed disk from the source rod to the destination rod
        System.out.println("Move disk " + topDisk.getSizeOfDisk() + " from " + source.getName() + " to " + destination.getName());
        moveDisks(numDisks - 1, auxiliary, destination, source); // Another recursion, moving the disk from the auxiliary rod to the destination rod, with the source rod as the auxiliary
    }
}