package io.javabrains.ratingsdataservice.model;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class UserRating {

    private String userId;
    private List<Rating> ratings;

    public void initData(String userId) {
        this.userId = userId;
        this.ratings = Arrays.asList(
                new Rating("100", 3),
                new Rating("200", 4),
                new Rating("300", 4),
                new Rating("400", 4)
        );
    }
}
