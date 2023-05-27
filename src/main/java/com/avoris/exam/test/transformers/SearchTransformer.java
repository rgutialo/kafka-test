package com.avoris.exam.test.transformers;

import com.avoris.exam.test.dtos.SearchDTO;
import com.avoris.exam.test.model.Search;

public interface SearchTransformer {

    public SearchDTO modelToDto(final Search search);

    public Search dtoToModel(final SearchDTO searchDTO);
}
