package adModels;

public class BaseAdvertising {
    protected int id;
    protected int clicks;
    protected int views;

    public BaseAdvertising() {
        this.clicks = 0;
        this.views = 0;
    }

    public int getClicks() {
        return this.clicks;
    }

    public int getViews() {
        return this.views;
    }

    public void incClicks() {
        this.clicks++;
    }

    public void incViews() {
        this.views++;
    }

    public void describeMe() {
        System.out.println("Name: BaseAdvertising\n" +
                "Description: This is base class for Ad and Advertiser classes.");
    }
}
