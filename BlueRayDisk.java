public class BlueRayDisk {

    public String title;
    public String director;
    public int yearOfRelase;
    public double cost;

    public BlueRayDisk(){}

    public BlueRayDisk(String t, String d, int y, double c){
        title = t;
        director = d;
        yearOfRelase = y;
        cost = c;
    }

    @Override
    public String toString() {
        return "$" + cost + " " + yearOfRelase + " " + title + ", " + director;
    }
}
