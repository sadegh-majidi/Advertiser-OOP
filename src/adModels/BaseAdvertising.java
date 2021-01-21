package adModels;

public abstract class BaseAdvertising {
    private int id;
    private int clicks;
    private int views;

    public BaseAdvertising(int id) {
        this.id = id;
        this.clicks = 0;
        this.views = 0;
    }
}
