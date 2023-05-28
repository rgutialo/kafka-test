package com.avoris.exam.test.transformers.impl;

import com.avoris.exam.test.dtos.SearchDTO;
import com.avoris.exam.test.model.Search;
import com.avoris.exam.test.transformers.Transformer;
import org.springframework.stereotype.Component;

@Component
public class SearchTransformerImpl implements Transformer<Search, SearchDTO> {
    @Override
    public SearchDTO modelToDto(Search search) {
        return new SearchDTO(search.getSearchId());
    }

    @Override
    public Search dtoToModel(SearchDTO searchDTO) {
        return new Search(searchDTO.getSearchId());
    }
}
