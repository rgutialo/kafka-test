package com.avoris.exam.test.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * Internal Search model implementation
 */
@Data
@Builder
public class Search implements Serializable {
    private final String searchId;
}
