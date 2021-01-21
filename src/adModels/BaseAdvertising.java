package adModels;

public class BaseAdvertising {
    private int id;
    private int clicks;
    private int views;

    public BaseAdvertising() {
        this.clicks = 0;
        this.views = 0;
    }

    protected BaseAdvertising(int id) {
        this();
        this.id = id;
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
