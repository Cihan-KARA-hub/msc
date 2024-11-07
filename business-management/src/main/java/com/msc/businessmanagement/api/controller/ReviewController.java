package com.msc.businessmanagement.api.controller;

import com.msc.businessmanagement.model.Review;
import com.msc.businessmanagement.services.customer.ReviewServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/review")
public class ReviewController {

    private final ReviewServices reviewServices;

    public ReviewController(ReviewServices reviewServices) {
        this.reviewServices = reviewServices;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createReview(@RequestBody Review review) {
        return reviewServices.addReview(review);
    }
}
