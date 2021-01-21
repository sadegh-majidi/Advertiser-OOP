package adModels;

import java.util.ArrayList;
import java.util.List;

public class Advertiser extends BaseAdvertising {
    private static List<Advertiser> allAdvertisers = new ArrayList<>();

    private String name;

    public Advertiser(int id, String name) {
        super(id);
        this.name = name;
        Advertiser.allAdvertisers.add(this);
    }
}
