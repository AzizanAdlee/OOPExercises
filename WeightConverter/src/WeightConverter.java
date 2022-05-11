class WeightConverter {

    private double gravity;

    public WeightConverter(double g) {
        gravity = g;
    }

    public double convert(double w) {
        return w * gravity;
    }
}
