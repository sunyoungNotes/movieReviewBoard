package com.example.fileupload.repository;

import com.example.fileupload.entity.Member;
import com.example.fileupload.entity.Movie;
import com.example.fileupload.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByMovie(Movie movie);

    void deleteByMember(Member member);
}
