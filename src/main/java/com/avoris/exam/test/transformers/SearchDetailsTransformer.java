package com.avoris.exam.test.transformers;

import com.avoris.exam.test.dtos.SearchDetailsDTO;
import com.avoris.exam.test.model.SearchDetails;

public interface SearchDetailsTransformer {

    public SearchDetailsDTO modelToDto(final SearchDetails searchDetails);

    public SearchDetails dtoToModel(final SearchDetailsDTO searchDetailsDTO);
}
