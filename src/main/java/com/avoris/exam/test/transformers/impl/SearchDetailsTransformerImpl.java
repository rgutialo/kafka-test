package com.avoris.exam.test.transformers.impl;

import com.avoris.exam.test.dtos.SearchDetailsDTO;
import com.avoris.exam.test.model.SearchDetails;
import com.avoris.exam.test.transformers.Transformer;
import org.springframework.stereotype.Component;

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
        return new SearchDetails(searchDetailsDTO.getHotelId(), searchDetailsDTO.getCheckIn(), searchDetailsDTO.getCheckOut(), searchDetailsDTO.getAges());
    }
}
