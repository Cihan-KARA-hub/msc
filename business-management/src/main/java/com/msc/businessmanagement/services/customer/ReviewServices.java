package com.msc.businessmanagement.services.customer;

import com.msc.businessmanagement.api.dto.ReviewDto;
import com.msc.businessmanagement.api.mapper.ReviewMapper;
import com.msc.businessmanagement.model.Review;
import com.msc.businessmanagement.repository.ReviewRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReviewServices {

    private final ReviewRepository reviewRepository;
    private final ReviewMapper reviewMapper;

    public ReviewServices(ReviewRepository reviewRepository, ReviewMapper reviewMapper) {
        this.reviewRepository = reviewRepository;
        this.reviewMapper = reviewMapper;
    }

    @Transactional
    public ResponseEntity<String> addReview(Review review) {
        reviewRepository.save(review);
        return ResponseEntity.ok("Review added");
    }

    @Transactional
    public ResponseEntity<String> deleteReview(Review review) {
        reviewRepository.delete(review);
        return ResponseEntity.ok("Review deleted");
    }

    @Transactional
    public ResponseEntity<String> updateReview(Review review) {
        reviewRepository.save(review);
        return ResponseEntity.ok("Review updated");
    }

    // ilgili salon ile ilgili tüm  yorumlar ;
    @Transactional
    public ResponseEntity<List<ReviewDto>> getBUsinessReview(long businessId) {
        List<Review> reviews = reviewRepository.findByBusinessId(businessId);
        List<ReviewDto> reviewsDto = reviewMapper.entityListToDtoList(reviews);
        return ResponseEntity.ok(reviewsDto);
    }
}
