package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository() {
        Review episode1 = new Review(1L, "Balance of Terror", "/images/balanceofterror.jpg", "TV, Science Fiction",
            "An excellent first season episode that serves as our introduction to the Romulan race and the Neutral Zone between the empires that continues to be a factor in other later Star Trek series." +
                    "Mark Leonard delivers a great performance as the Romulan Commander and the episode touches on themes of space predjudice with Lt. Stiles attitude towards Spock.",
            "Episode 14", "The Enterprise battles a Romulan Bird of Prey with an advanced weapon in the Neutral Zone.", "/images/balanceofterrortitle.jpg");
        Review episode2 = new Review(2L, "Space Seed", "/images/spaceseed.jpg", "TV, Science Fiction",
                "This episode later serves as the basis for Star Trek II: The Wrath of Khan. Ricardo Montalban does a great job playing Khan; the one villain from the original series you really felt could defeat Kirk.",
                "Episode 22", "The crew discovers a group of genetically-engineered beings from Earth's past who try to take over the ship.", "/images/spaceseedtitle.jpg");
        Review episode3 = new Review(3L, "Mirror, Mirror", "/images/mirrormirror.jpg", "TV, Science Fiction",
                "Leonard Nimoy does an awesome job playing Evil Spock. Who doesn't love seeing our favorite logical Vulcan in a complete role reversal serving an evil empire? This guy does *gestures with thumbs towards self* I can tell you that much.",
                "Episode 33", "Crew members switch universes with their counterparts and have to escape back home before they're found out.", "/images/mirrormirrortitle.jpg");
        Review episode4 = new Review(4L, "Spock's Brain", "/images/spocksbrain.jpg", "TV, Science Fiction",
                "The device that gives people to knowledge to remove brains is called the Controller. It's not a Java controller, but it should be. A lot of people think this is one of the worst episodes of the original series and I have to agree; the controller not being part of a Java MVC format now really ruins it for me.",
                "Episode 56", "Spock's brain (bet you never saw that coming from the episode title) gets yanked out. McCoy has to put on a blow-dryer-like contraption to gain the knowledge to get it back.", "/images/spocksbraintitle.jpg");

        reviewsList.put(episode1.getId(), episode1);
        reviewsList.put(episode2.getId(), episode2);
        reviewsList.put(episode3.getId(), episode3);
        reviewsList.put(episode4.getId(), episode4);

    }


    public ReviewRepository(Review ...reviewsToAdd) {
        for(Review review: reviewsToAdd) {
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}
