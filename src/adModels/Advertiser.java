package adModels;

import java.util.ArrayList;
import java.util.List;

public class Advertiser extends BaseAdvertising {
    private static List<Advertiser> allAdvertisers = new ArrayList<>();

    private String name;

    public Advertiser(int id, String name) {
        super();
        if (Advertiser.allAdvertisers.stream().anyMatch(advertiser -> advertiser.id == id))
            throw new IllegalArgumentException("Advertiser id Should be unique.");
        super.id = id;
        this.name = name;
        Advertiser.allAdvertisers.add(this);
    }

    public static int getTotalClicks() {
        return Advertiser.allAdvertisers.stream().mapToInt(BaseAdvertising::getClicks).sum();
    }

    public static void help() {
        System.out.println("Advertiser Fields ->\n" +
                "id: unique id of advertiser\n" +
                "name: name of this advertiser\n" +
                "views: number of total views of this advertiser's ads\n" +
                "clicks: number of total clicks of this advertiser's ads");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void describeMe() {
        System.out.println("Name: Advertiser\n" +
                "Description: This class is a blueprint to create advertiser objects and derived from BaseAdvertising Base class.");
    }
}
