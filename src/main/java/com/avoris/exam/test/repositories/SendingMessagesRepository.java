package com.avoris.exam.test.repositories;

import com.avoris.exam.test.model.Search;
import com.avoris.exam.test.model.SearchDetails;

public interface SendingMessagesRepository {

    public Search sendMessage(final String topic, final SearchDetails searchDetails);
}
