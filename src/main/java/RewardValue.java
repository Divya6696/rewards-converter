public class RewardValue {
    private double cash;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.cash = milesToCash(miles);
    }

    private double milesToCash(int miles){
        return miles*0.0035;
    }

    private int cashToMiles(double cash){
        return (int) (cash/0.0035);
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return cashToMiles(this.cash);
    }
}
