package com.avoris.exam.test.dtos;

import java.io.Serializable;

/**
 * Contains basic information about Search exposed to external systems
 */
public class SearchDTO implements Serializable {

    private final String searchId;

    public SearchDTO(final String searchId) {
        this.searchId = searchId;
    }

    public SearchDTO() {
        this.searchId = "";
    }

    public String getSearchId() {
        return searchId;
    }


    @Override
    public String toString() {
        return "SearchDTO{" +
                "searchId='" + searchId + '\'' +
                '}';
    }
    /*
    public SearchDTO(final SearchDTO.Builder<?> builder) {
        this.searchId = builder.searchId;
    }

    @SuppressWarnings("java:S3740")
    public static SearchDTO.Builder builder() {
        return new SearchDTO.Builder() {
            @Override
            public SearchDTO.Builder getThis() {
                return this;
            }
        };
    }

    public abstract static class Builder<T extends SearchDTO.Builder<T>> {

        private String searchId;

        public abstract T getThis();

        public T searchId(final String searchId) {
            return getThis();
        }

        public SearchDTO build() {
            return new SearchDTO(this);
        }
    }
     */
}
