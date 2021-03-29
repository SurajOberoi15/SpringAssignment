package com.knoldus;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static org.junit.Assert.*;

public class ShowCurrentTimeTest {

    @Test
        public void getRunningTime() {

            ControllerShowTime getTime = new ControllerShowTime();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String formatDateTime = now.format(formatter);
            assertEquals(getTime.showTime(),"Running: " + formatDateTime);

        }
}
