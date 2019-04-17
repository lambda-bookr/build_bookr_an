package com.example.israel.build_week_1_bookr.worker_thread;

import android.os.AsyncTask;

import com.example.israel.build_week_1_bookr.dao.BookrAPIDAO;

public class RequestAddReviewAsyncTask extends AsyncTask<Void, Void, Boolean> {

    public RequestAddReviewAsyncTask(int bookId, int userId, int rating, String review) {
        this.bookId = bookId;
        this.userId = userId;
        this.rating = rating;
        this.review = review;
    }

    private int bookId;
    private int userId;
    private int rating;
    private String review;

    @Override
    protected Boolean doInBackground(Void... voids) {

        return BookrAPIDAO.addReview(bookId, userId, rating, review);
    }
}