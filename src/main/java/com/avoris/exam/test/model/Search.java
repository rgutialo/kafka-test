package com.avoris.exam.test.model;

import java.io.Serializable;

/**
 * Internal Search model implementation
 */
public class Search implements Serializable {
    private final String searchId;

    public String getSearchId() {
        return searchId;
    }

    public Search(final String searchId) {
        this.searchId = searchId;
    }

    @Override
    public String toString() {
        return "Search{" +
                "searchId='" + searchId + '\'' +
                '}';
    }
    /*
    public Search(final Search.Builder<?> builder) {
        this.searchId = builder.searchId;
    }

    @SuppressWarnings("java:S3740")
    public static Search.Builder builder() {
        return new Search.Builder() {
            @Override
            public Search.Builder getThis() {
                return this;
            }
        };
    }

    public abstract static class Builder<T extends Search.Builder<T>> {

        private String searchId;

        public abstract T getThis();

        public T searchId(final String searchId) {
            return getThis();
        }

        public Search build() {
            return new Search(this);
        }
    }

     */
}
