package com.example.parserrestservice;

import org.gbif.common.parsers.core.ParseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.gbif.common.parsers.date.TemporalParser;
import org.gbif.common.parsers.date.DateParsers;

import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;

@RestController
public class DatingController {

    private static final TemporalParser dateParser = DateParsers.defaultTemporalParser();

    @GetMapping("/date")
    public Dating dating(@RequestParam(value = "date", defaultValue = "2nd jan. 1999") String date) {
        ParseResult<TemporalAccessor> ta = dateParser.parse(date);
        LocalDate localDate = LocalDate.from(ta.getPayload());
        System.out.println(localDate);

        return new Dating(localDate.toString());
    }

}


