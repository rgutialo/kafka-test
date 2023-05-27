package com.avoris.exam.test.facades;

import com.avoris.exam.test.dtos.SearchDTO;
import com.avoris.exam.test.dtos.SearchDetailsDTO;
import com.avoris.exam.test.dtos.SearchResultsDTO;

public interface SearchFacade {

    public SearchDTO addSearch(final SearchDetailsDTO searchDetailsDTO);

    public SearchResultsDTO findResults(final SearchDTO searchDetailsDTO);
}
