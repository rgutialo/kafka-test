package com.avoris.exam.test.controllers;

import com.avoris.exam.test.dtos.SearchDTO;
import com.avoris.exam.test.dtos.SearchDetailsDTO;
import com.avoris.exam.test.facades.SearchFacade;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class SearchControllerTest {

    @InjectMocks
    private SearchController testObj;
    @Mock
    private SearchFacade searchFacadeMock;

    @Mock
    private SearchDTO searchDTOMock;

    @Mock
    private SearchDetailsDTO searchDetailsDTOMock;

    @Test
    void addSearch_OnceSearchDetailsIsValid_thenSearchFacadeAddSearchIsInvoked() {

        testObj.addSearch(searchDetailsDTOMock);
        verify(searchFacadeMock).addSearch(searchDetailsDTOMock);
    }

    @Test
    void findResults_OnceSearchIsValid_ThenSearchFacadeFindResultsIsInvoked() {

        testObj.findResults("1234");
        verify(searchFacadeMock).findResults("1234");
    }
}