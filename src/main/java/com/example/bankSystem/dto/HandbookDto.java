package com.example.bankSystem.dto;

import com.example.bankSystem.enums.handbook.HandbookType;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class HandbookDto {
    private HandbookType type;
    private String code;
    private String title;
    private Date validFrom;
    private Date validUntil;

}
