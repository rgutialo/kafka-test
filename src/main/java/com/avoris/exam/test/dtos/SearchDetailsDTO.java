package com.avoris.exam.test.dtos;

import java.io.Serializable;
import java.util.List;

/**
 * Contains basic information about Search Details object exposed to external systems
 */
public class SearchDetailsDTO implements Serializable {

    private final String hotelId;
    private final String checkIn;
    private final String checkOut;
    private final List<Integer> ages;

    public SearchDetailsDTO(final String hotelId, final String checkIn, final String checkOut, final List<Integer> ages) {
        this.hotelId = hotelId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
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
        return "SearchDetailsDTO{" +
                "hotelId='" + hotelId + '\'' +
                ", checkIn='" + checkIn + '\'' +
                ", checkOut='" + checkOut + '\'' +
                ", ages=" + ages +
                '}';
    }
/*
    public SearchDetailsDTO(final Builder<?> builder) {
        this.hotelId = builder.hotelId;
        this.checkIn = builder.checkIn;
        this.checkOut = builder.checkOut;
        this.ages = builder.ages;
    }
    @SuppressWarnings("java:S3740")
    public static Builder builder() {
        return new Builder() {
            @Override
            public Builder getThis() {
                return this;
            }
        };
    }

    public abstract static class Builder<T extends Builder<T>> {

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

        public SearchDetailsDTO build() {
            return new SearchDetailsDTO(this);
        }
    }

 */
}
