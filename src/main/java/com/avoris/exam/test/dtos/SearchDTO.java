package com.avoris.exam.test.dtos;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * Contains basic information about Search object exposed to external systems
 */
@Data
@Builder
public class SearchDTO implements Serializable {

    private final String searchId;
}
