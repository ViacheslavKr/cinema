package com.krukovskyi.movie.services;

import com.krukovskyi.movie.models.Cinema;
import com.krukovskyi.movie.models.reports.BoxOfficeReport;
import com.krukovskyi.movie.models.reports.GapReport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static com.krukovskyi.movie.utils.DateUtils.createDate;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReportingServiceIntegrationTest {
    @Autowired
    private ReportingServiceImpl reportingService;

    @Test
    public void findCinemaByShowings() {
        List<Cinema> result = reportingService.findCinemaByShowings(5L, createDate(2019, 5, 1),
                createDate(2019, 5, 1));
        assertEquals(2, result.size());
        assertEquals(Long.valueOf(1L), result.get(0).getId());
        assertEquals(Long.valueOf(3L), result.get(1).getId());
    }

    @Test
    public void findCinemaByShowingsOverlapNewDay() {
        List<Cinema> result = reportingService.findCinemaByShowings(5L, createDate(2019, 5, 13),
                createDate(2019, 5, 13));

        assertTrue(result.isEmpty());

        result = reportingService.findCinemaByShowings(1L, createDate(2019, 5, 13),
                createDate(2019, 5, 14));
        assertEquals(1, result.size());
        assertEquals(Long.valueOf(4L), result.get(0).getId());
    }

    @Test
    public void getShowingGaps() {
        Date beginDate = createDate(2019, 5, 1);
        Date endDate = createDate(2019, 5, 1);
        GapReport result = reportingService.findCinemaShowingGaps(1L, beginDate, endDate);
        assertEquals(3, result.getGaps().size());
        assertEquals(Long.valueOf(1L), result.getCinema().getId());
        assertEquals("Gap duration 70 : 2019-06-01 14:00:00.0 - 2019-06-01 15:10:00.0", result.getGaps().get(0));
        assertEquals("Gap duration 70 : 2019-06-01 17:00:00.0 - 2019-06-01 18:10:00.0", result.getGaps().get(1));
        assertEquals("Gap duration 130 : 2019-06-01 19:00:00.0 - 2019-06-01 21:10:00.0", result.getGaps().get(2));
        assertTrue(result.getStartDate().compareTo(beginDate) == 0);
        assertTrue(result.getEndDate().compareTo(endDate) == 0);

    }
    @Test
    public void getBoxOfficeOneDay(){
        Date beginDate = createDate(2019, 5, 1);
        Date endDate = createDate(2019, 5, 1);
        BoxOfficeReport result = reportingService.getBoxOffice(1L, 1L, beginDate, endDate);
        assertNotNull(result);
        assertEquals(3, result.getBoxOfficeDetails().size());
        assertEquals(BigDecimal.valueOf(9), result.getTotalBoxAmount());
        assertEquals(0,BigDecimal.valueOf(980).compareTo(result.getTotalBoxOffice()));
    }
    @Test
    public void getBoxOfficeFewDays(){
        Date beginDate = createDate(2019, 5, 1);
        Date endDate = createDate(2019, 5, 5);
        BoxOfficeReport result = reportingService.getBoxOffice(1L, 1L, beginDate, endDate);
        assertNotNull(result);
        assertEquals(10, result.getBoxOfficeDetails().size());
        assertEquals(BigDecimal.valueOf(17), result.getTotalBoxAmount());
        assertEquals(0,BigDecimal.valueOf(1358).compareTo(result.getTotalBoxOffice()));
    }
}
