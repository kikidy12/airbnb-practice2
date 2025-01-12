package com.example.airbnbpractice.dto;

import com.example.airbnbpractice.entity.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;
import java.util.Set;

public class HouseRequestDto {

    @Getter
    @AllArgsConstructor
    public static class HouseAdd {
        private String adminDistrict;
        private String detailAddress;
        private String content;
        private Integer maxPeople;
        private Integer pricePerDay;
        private Set<Long> tagIds;
    }
}
