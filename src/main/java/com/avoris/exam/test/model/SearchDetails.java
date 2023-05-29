package com.avoris.exam.test.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Internal Search  Details model implementation
 */
@Document("SearchDetails")
public class SearchDetails  {

    @Id
    private final String id;
    private final String hotelId;
    private final String checkIn;
    private final String checkOut;
    private final String searchId;
    private final List<Integer> ages;

    public SearchDetails(
            final String id, final String hotelId, final String checkIn, final String checkOut, String searchId, final List<Integer> ages) {
        this.id = id;
        this.hotelId = hotelId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.searchId = searchId;
        this.ages = ages;
    }

    public String getHotelId() {
        return hotelId;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public List<Integer> getAges() {
        return ages;
    }

    @Override
    public String toString() {
        return "SearchDetails{" +
                "hotelId='" + hotelId + '\'' +
                ", checkIn='" + checkIn + '\'' +
                ", checkOut='" + checkOut + '\'' +
                ", ages=" + ages +
                '}';
    }
/*
    public SearchDetails(final SearchDetails.Builder<?> builder) {
        this.hotelId = builder.hotelId;
        this.checkIn = builder.checkIn;
        this.checkOut = builder.checkOut;
        this.ages = builder.ages;
    }

    @SuppressWarnings("java:S3740")
    public static SearchDetails.Builder builder() {
        return new SearchDetails.Builder() {
            @Override
            public SearchDetails.Builder getThis() {
                return this;
            }
        };
    }

    public abstract static class Builder<T extends SearchDetails.Builder<T>> {

        private String hotelId;
        private String checkIn;
        private String checkOut;
        private List<Integer> ages;

        public abstract T getThis();

        public T hotelId(final String hotelId) {
            this.hotelId = hotelId;
            return getThis();
        }

        public T checkIn(final String checkIn) {
            this.checkIn = checkIn;
            return getThis();
        }

        public T checkOut(final String checkOut) {
            this.checkOut = checkOut;
            return getThis();
        }

        public T ages(final List<Integer> ages) {
            this.ages = ages;
            return getThis();
        }

        public SearchDetails build() {
            return new SearchDetails(this);
        }
    }
    */
}
