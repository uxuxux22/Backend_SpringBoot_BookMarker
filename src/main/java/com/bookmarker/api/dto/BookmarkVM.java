package com.bookmarker.api.dto;

import java.time.Instant;

//ViewModel 객체
public interface BookmarkVM {
    Long getId();
    String getTitle();
    String getUrl();
    Instant getCreatedAt();
}