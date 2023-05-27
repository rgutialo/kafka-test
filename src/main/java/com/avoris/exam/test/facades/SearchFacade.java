package com.avoris.exam.test.facades;

import com.avoris.exam.test.dtos.SearchDTO;
import com.avoris.exam.test.dtos.SearchDetailsDTO;

public interface SearchFacade {

    public SearchDTO addSearch(final SearchDetailsDTO searchDetailsDTO);
}
