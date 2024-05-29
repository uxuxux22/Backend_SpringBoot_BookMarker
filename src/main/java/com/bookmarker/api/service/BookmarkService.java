package com.bookmarker.api.service;

import com.bookmarker.api.domain.Bookmark;
import com.bookmarker.api.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository repository;

    @Transactional(readOnly = true)  // 조회할때는 읽기 전용 조회메서드 으로 하여 속도에유
    public List<Bookmark> getBookmarks() {
        return repository.findAll();  //조회
    }

}