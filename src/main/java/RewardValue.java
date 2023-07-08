public class RewardValue {
    private double cash;
    private float miles;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(float miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        return miles * 0.0035;
    }

    public double getMilesValue() {
        return cash/0.0035;
    }
}
