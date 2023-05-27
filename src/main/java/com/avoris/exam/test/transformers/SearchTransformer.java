package com.avoris.exam.test.transformers;

import com.avoris.exam.test.dtos.SearchDTO;
import com.avoris.exam.test.dtos.SearchDetailsDTO;
import com.avoris.exam.test.model.Search;
import com.avoris.exam.test.model.SearchDetails;

public interface SearchTransformer {

    public SearchDTO modelToDto(final Search search);
    public Search dtoToModel(final SearchDTO searchDTO);
}
