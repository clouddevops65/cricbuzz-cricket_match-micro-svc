package com.cloudtechmasters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
public class CourseController {
    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);
//create two endpoints getLivescores and getRecentMatches
    @GetMapping("/live-scores")
    public List<String> getLivescores(){
        logger.info("added for failing sonar build");
        return Arrays.asList("India vs Pakistan, 1st T20", "IND: 87-0", "Overs: 8");
    }

    @GetMapping("/live-scores/recent-matches")
    public List<String> getRecentMatches(){
        return Arrays.asList("NZ vs Pakistan, 1st T20", "PAK won by 6 wickets");
    }

}
