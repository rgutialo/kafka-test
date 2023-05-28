package com.avoris.exam.test.dtos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SearchDetailsDTOTest {

    public static final String HOTEL_ID = "1234";
    public static final String CHECK_IN = "checkIn";
    public static final String CHECK_OUT = "checkOut";
    public static final List<Integer> AGES = List.of(1, 2, 3);
    private SearchDetailsDTO testObj;

    @BeforeEach
    private void setUp() {
        testObj = new SearchDetailsDTO(HOTEL_ID, CHECK_IN, CHECK_OUT, AGES);
    }


    @Test
    void getHotelId_shouldReturnHotelId() {
        final var result = testObj.getHotelId();

        assertThat(result).isEqualTo(HOTEL_ID);
    }

    @Test
    void getCheckIn_shouldReturnCheckIn() {
        final var result = testObj.getCheckIn();

        assertThat(result).isEqualTo(CHECK_IN);
    }

    @Test
    void getCheckOut_shouldReturnCheckOut() {
        final var result = testObj.getCheckOut();

        assertThat(result).isEqualTo(CHECK_OUT);
    }

    @Test
    void getAges_shouldReturnAges() {
        final var result = testObj.getAges();

        assertThat(result).isEqualTo(AGES);
    }
}