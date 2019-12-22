public class Human implements Jacket, Pants, Footwear {
    private String name;
    private Footwear1 footwear;
    private Jacket jacket;
    private Pants1 pants;

    Human() {
        this.name = name;
        this.footwear = footwear;
        this.jacket = jacket;
        this.pants = pants;
    }

    @Override
    public void putOn() {
        footwear.putOn();
        jacket.putOn();
        pants.putOn();
    }

    @Override
    public void takeOff() {
        footwear.takeOff();
        jacket.takeOff();
        pants.takeOff();
    }
}
