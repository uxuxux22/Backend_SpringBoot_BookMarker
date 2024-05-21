package com.bookmarker.api.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateBookmarkRequest {
    @NotEmpty(message = "Title은 필수 입력항목 입니다.")
    private String title;
    @NotEmpty(message = "Url should not be empty")
    private String url;
}