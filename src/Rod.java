import java.util.ArrayList;
public class Rod
{
    private String name;
    private ArrayList<Disk> disks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Disk> getDisks() {
        return disks;
    }

    public void setDisks(ArrayList<Disk> disks) {
        this.disks = disks;
    }

    public void addDisk(Disk disk)
    {
        disks.add(disk);
    }

    public Rod()
    {
        disks = new ArrayList<>();
    }
}
