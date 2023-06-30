package com.avoris.exam.test.dtos;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Contains basic information about Search Details object exposed to external systems
 */
@Data
@Builder
public class SearchDetailsDTO implements Serializable {

    private final String hotelId;
    private final String checkIn;
    private final String checkOut;
    private final List<Integer> ages;
}
