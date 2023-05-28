package com.avoris.exam.test.transformers;

import com.avoris.exam.test.dtos.SearchDTO;
import com.avoris.exam.test.model.Search;

public interface Transformer<M,D> {

    public D modelToDto(final M model);

    public M dtoToModel(final D dto);
}
