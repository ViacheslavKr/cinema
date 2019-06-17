package com.krukovskyi.movie.services;

import com.krukovskyi.movie.models.Showing;
import com.krukovskyi.movie.utils.DateUtils;
import com.krukovskyi.movie.utils.GapCollector;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class GapCollectorTest {

    @Test
    public void oneGap() {
        List<Showing> showings = new LinkedList<>();

        Showing showing = new Showing();
        showing.setBeginTime(DateUtils.createTimestamp(2019, 5, 1, 10, 0));
        showing.setEndTime(DateUtils.createTimestamp(2019, 5, 1, 10, 10));
        showings.add(showing);

        Showing showing1 = new Showing();
        showing1.setBeginTime(DateUtils.createTimestamp(2019, 5, 1, 10, 40));
        showing1.setEndTime(DateUtils.createTimestamp(2019, 5, 1, 13, 10));
        showings.add(showing1);

        Showing showing2 = new Showing();
        showing2.setBeginTime(DateUtils.createTimestamp(2019, 5, 1, 13, 20));
        showing2.setEndTime(DateUtils.createTimestamp(2019, 5, 1, 15, 30));
        showings.add(showing2);

        Showing showing3 = new Showing();
        showing3.setBeginTime(DateUtils.createTimestamp(2019, 5, 1, 15, 45));
        showing3.setEndTime(DateUtils.createTimestamp(2019, 5, 1, 17, 30));
        showings.add(showing3);

        Showing showing4 = new Showing();
        showing4.setBeginTime(DateUtils.createTimestamp(2019, 5, 1, 17, 46));
        showing4.setEndTime(DateUtils.createTimestamp(2019, 5, 1, 20, 30));
        showings.add(showing4);


        List<String> result = showings.stream().collect(GapCollector.collector());
        Assert.assertEquals(2, result.size());


    }


}