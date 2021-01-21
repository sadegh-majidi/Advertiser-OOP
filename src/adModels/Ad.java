package adModels;

import java.util.ArrayList;
import java.util.List;

public class Ad extends BaseAdvertising {
    private static List<Integer> ids = new ArrayList<>();

    private String title;
    private String imgURL;
    private String link;
    private Advertiser advertiser;

    public Ad(int id, String title, String imgURL, String link, Advertiser advertiser) {
        super();
        if (Ad.ids.stream().anyMatch(integer -> integer == id))
            throw new IllegalArgumentException("Id " + id + " is duplicated. Id of the Ad Should be unique.");
        if (advertiser == null)
            throw new NullPointerException("Must provide an advertiser to ad.");
        super.id = id;
        this.title = title;
        this.imgURL = imgURL;
        this.link = link;
        this.advertiser = advertiser;
        ids.add(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String url) {
        this.imgURL = url;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }

    @Override
    public void incClicks() {
        super.incClicks();
        this.advertiser.incClicks();
    }

    @Override
    public void incViews() {
        super.incViews();
        this.advertiser.incViews();
    }

    @Override
    public void describeMe() {
        System.out.println("Name: Ad\n" +
                "Description: This class is a blueprint to create advertisement objects and derived from BaseAdvertising Base class.");
    }
}
