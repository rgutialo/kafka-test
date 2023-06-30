package com.avoris.exam.test.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

/**
 * Internal Search  Details model implementation
 */
@Data
@Builder
@AllArgsConstructor
@Document("SearchDetails")
public class SearchDetails implements Serializable {

    @Id
    private String id;
    private String hotelId;
    private String checkIn;
    private String checkOut;
    private String searchId;
    private List<Integer> ages;

    public SearchDetails() {}
}
