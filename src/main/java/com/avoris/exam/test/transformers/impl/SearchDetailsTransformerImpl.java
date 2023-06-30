package com.avoris.exam.test.transformers.impl;

import com.avoris.exam.test.dtos.SearchDetailsDTO;
import com.avoris.exam.test.model.SearchDetails;
import com.avoris.exam.test.transformers.Transformer;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Implementation of {@link Transformer}
 */
@Component
public class SearchDetailsTransformerImpl implements Transformer<SearchDetails, SearchDetailsDTO> {

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchDetailsDTO modelToDto(SearchDetails searchDetails) {
        return SearchDetailsDTO.builder()
                .hotelId(searchDetails.getHotelId())
                .checkIn(searchDetails.getCheckIn())
                .checkOut(searchDetails.getCheckOut())
                .ages(searchDetails.getAges())
                .build();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchDetails dtoToModel(SearchDetailsDTO searchDetailsDTO) {
        return SearchDetails.builder()
                .id("TEST")
                .hotelId(searchDetailsDTO.getHotelId())
                .checkIn(searchDetailsDTO.getCheckIn())
                .checkOut(searchDetailsDTO.getCheckOut())
                .ages(searchDetailsDTO.getAges())
                .searchId("TEST")
                .build();
    }
}
