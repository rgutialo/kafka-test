package com.avoris.exam.test.transformers.impl;

import com.avoris.exam.test.dtos.SearchDTO;
import com.avoris.exam.test.model.Search;
import com.avoris.exam.test.transformers.Transformer;
import org.springframework.stereotype.Component;

/**
 * Implementation of {@link Transformer}
 */
@Component
public class SearchTransformerImpl implements Transformer<Search, SearchDTO> {
    /**
     * {@inheritDoc}
     */
    @Override
    public SearchDTO modelToDto(Search search) {
        return new SearchDTO(search.getSearchId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Search dtoToModel(SearchDTO searchDTO) {
        return new Search(searchDTO.getSearchId());
    }
}
