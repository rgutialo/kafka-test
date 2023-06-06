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
        return new SearchDetailsDTO(searchDetails.getHotelId(), searchDetails.getCheckIn(), searchDetails.getCheckOut(), searchDetails.getAges());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SearchDetails dtoToModel(SearchDetailsDTO searchDetailsDTO) {
        final SearchDetails searchDetailsResponse = new SearchDetails();
        searchDetailsResponse.setId("1111");
        searchDetailsResponse.setHotelId("1234aBc");
        searchDetailsResponse.setCheckIn("29/12/2023");
        searchDetailsResponse.setCheckOut("21/12/2023");
        searchDetailsResponse.setSearchId("1234");
        searchDetailsResponse.setAges(List.of(3, 29, 30, 1));

        return searchDetailsResponse;
    }
}
