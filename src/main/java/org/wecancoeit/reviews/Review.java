package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String title;
    private String imageURL;
    private String category;
    private String content;
    private String episodeNumber;
    private String synopsis;
    private String imageURL2;

    public Review(long id, String title, String imageURL, String category, String content, String episodeNumber, String synopsis, String imageURL2) {
        this.id = id;
        this.title = title;
        this.imageURL = imageURL;
        this.category = category;
        this.content = content;
        this.episodeNumber = episodeNumber;
        this.synopsis = synopsis;
        this.imageURL2 = imageURL2;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getImageURL2() {
        return imageURL2;
    }

    public String getCategory() {
        return category;
    }

    public String getContent() {
        return content;
    }

    public String getEpisodeNumber() {
        return episodeNumber;
    }

    public String getSynopsis() {
        return synopsis;
    }
}
