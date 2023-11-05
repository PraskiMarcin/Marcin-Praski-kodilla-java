package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StatisticCalculatorTest {
    private Statistics statistics;
    private StatisticCalculator statisticCalculator;

    @BeforeEach
    public void init(){
        statistics = mock(Statistics.class);
        statisticCalculator = new StatisticCalculator();
    }

    @Test
    public void whenPostCountEqualsZero(){
        when(statistics.usersNames())
                .thenReturn(List.of("Mrrcin","Mrrcin1","Mrrcin2" ));
        when(statistics.postsCount())
                .thenReturn(0);
        when(statistics.commentsCount())
                .thenReturn(10);

        statisticCalculator.calculateAdvStatistics(statistics);

        assertEquals(3,statisticCalculator.getUserCount());
        assertEquals(0,statisticCalculator.getPostCount());
        assertEquals(10,statisticCalculator.getCommentCount());
        assertEquals(0, statisticCalculator.getAvgPostPerUser());
        assertEquals((double) 10 /3, statisticCalculator.getAvgCommentPerUser());
        assertEquals(0.0, statisticCalculator.getAvgCommentPerPost());
    }

    @Test
    public void whenPostCountEquals1000(){
        when(statistics.usersNames())
                .thenReturn(List.of("Mrrcin","Mrrcin1","Mrrcin2" ));
        when(statistics.postsCount())
                .thenReturn(1000);
        when(statistics.commentsCount())
                .thenReturn(10);

        statisticCalculator.calculateAdvStatistics(statistics);

        assertEquals(3,statisticCalculator.getUserCount());
        assertEquals(1000,statisticCalculator.getPostCount());
        assertEquals(10,statisticCalculator.getCommentCount());
        assertEquals((double) 1000 /3, statisticCalculator.getAvgPostPerUser());
        assertEquals((double) 10 /3, statisticCalculator.getAvgCommentPerUser());
        assertEquals((double) 10 /1000, statisticCalculator.getAvgCommentPerPost());
    }

    @Test
    public void whenCommentCountEquals0(){
        when(statistics.usersNames())
                .thenReturn(List.of("Mrrcin","Mrrcin1","Mrrcin2" ));
        when(statistics.postsCount())
                .thenReturn(5);
        when(statistics.commentsCount())
                .thenReturn(0);

        statisticCalculator.calculateAdvStatistics(statistics);

        assertEquals(3,statisticCalculator.getUserCount());
        assertEquals(5,statisticCalculator.getPostCount());
        assertEquals(0,statisticCalculator.getCommentCount());
        assertEquals((double) 5/3, statisticCalculator.getAvgPostPerUser());
        assertEquals(0, statisticCalculator.getAvgCommentPerUser());
        assertEquals(0, statisticCalculator.getAvgCommentPerPost());
    }

    @Test
    public void whenCountCommentIsLowerThanPosts(){
        when(statistics.usersNames())
                .thenReturn(List.of("Mrrcin","Mrrcin1","Mrrcin2" ));
        when(statistics.postsCount())
                .thenReturn(10);
        when(statistics.commentsCount())
                .thenReturn(2);

        statisticCalculator.calculateAdvStatistics(statistics);

        assertEquals(3,statisticCalculator.getUserCount());
        assertEquals(10,statisticCalculator.getPostCount());
        assertEquals(2,statisticCalculator.getCommentCount());
        assertEquals((double) 10/3, statisticCalculator.getAvgPostPerUser());
        assertEquals((double) 2 /3, statisticCalculator.getAvgCommentPerUser());
        assertEquals((double) 2 /10, statisticCalculator.getAvgCommentPerPost());
    }

    @Test
    public void whenCountCommentIsBiggerThanPosts(){
        when(statistics.usersNames())
                .thenReturn(List.of("Mrrcin","Mrrcin1","Mrrcin2" ));
        when(statistics.postsCount())
                .thenReturn(2);
        when(statistics.commentsCount())
                .thenReturn(10);

        statisticCalculator.calculateAdvStatistics(statistics);

        assertEquals(3,statisticCalculator.getUserCount());
        assertEquals(2,statisticCalculator.getPostCount());
        assertEquals(10,statisticCalculator.getCommentCount());
        assertEquals((double) 2/3, statisticCalculator.getAvgPostPerUser());
        assertEquals((double) 10/3, statisticCalculator.getAvgCommentPerUser());
        assertEquals(5, statisticCalculator.getAvgCommentPerPost());
    }

    @Test
    public void whenTheNumberOfUsersIsEqualZer(){
        when(statistics.usersNames())
                .thenReturn(List.of());
        when(statistics.postsCount())
                .thenReturn(2);
        when(statistics.commentsCount())
                .thenReturn(10);

        statisticCalculator.calculateAdvStatistics(statistics);

        assertEquals(0,statisticCalculator.getUserCount());
        assertEquals(2,statisticCalculator.getPostCount());
        assertEquals(10,statisticCalculator.getCommentCount());
        assertEquals(0, statisticCalculator.getAvgPostPerUser());
        assertEquals(0, statisticCalculator.getAvgCommentPerUser());
        assertEquals(5, statisticCalculator.getAvgCommentPerPost());
    }

    @Test
    public void whenTheNumberOfUsersIsEqualHundred(){
        List<String> users = new ArrayList<>();
        for (int i = 0 ; i < 100 ; i++){
            users.add("user");
        }

        when(statistics.usersNames())
                .thenReturn(users);
        when(statistics.postsCount())
                .thenReturn(2);
        when(statistics.commentsCount())
                .thenReturn(10);

        statisticCalculator.calculateAdvStatistics(statistics);

        assertEquals(100,statisticCalculator.getUserCount());
        assertEquals(2,statisticCalculator.getPostCount());
        assertEquals(10,statisticCalculator.getCommentCount());
        assertEquals((double) 2 /100, statisticCalculator.getAvgPostPerUser());
        assertEquals((double) 10 /100, statisticCalculator.getAvgCommentPerUser());
        assertEquals(5, statisticCalculator.getAvgCommentPerPost());
    }


}