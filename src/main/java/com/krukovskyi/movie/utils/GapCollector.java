package com.krukovskyi.movie.utils;

import com.krukovskyi.movie.models.Showing;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;

public class GapCollector {
    public static final int CRITICAL_SHOWING_GAP = 15;
    private List<String> gaps = new LinkedList<>();

    private Showing first;
    private Showing second;

    public void accept(Showing showing) {
        first = second;
        second = showing;
        if (first != null && getGapDuration() > CRITICAL_SHOWING_GAP) {
            gaps.add("Gap duration " + getGapDuration() + " : " + first.getEndTime() + " - " + second.getBeginTime());
        }
    }

    private long getGapDuration() {
        return Duration.between(first.getEndTime().toLocalDateTime(), second.getBeginTime().toLocalDateTime()).toMinutes();
    }

    public GapCollector combine(GapCollector other) {
        throw new UnsupportedOperationException("Parallel Stream not supported");
    }

    public List<String> finish() {
        return gaps;
    }

    public static Collector<Showing, ?, List<String>> collector() {
        return Collector.of(GapCollector::new, GapCollector::accept, GapCollector::combine, GapCollector::finish);
    }

}
