public class EUR implements Convertable{

    private double course = 31.2;

    public double convert(double course) {

        return this.course * course;
    }
}