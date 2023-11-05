package com.kodilla.testing.forum.statistics;

public class StatisticCalculator {
    private int userCount;
    private int postCount;
    private int commentCount;
    private double avgPostPerUser;
    private double avgCommentPerUser;
    private double avgCommentPerPost;



    void calculateAdvStatistics(Statistics statistics){
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();

        if (userCount > 0){
            avgPostPerUser = (double) postCount / userCount;
            avgCommentPerUser = (double) commentCount / userCount;
        }

        if (postCount > 0){
            avgCommentPerPost = (double) commentCount / postCount;
        }

    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentPerUser() {
        return avgCommentPerUser;
    }

    public double getAvgCommentPerPost() {
        return avgCommentPerPost;
    }
}
