package com.software.designpattern.creational.simplefactory;

import java.time.LocalDate;

public class NewsPost extends Post{
    private String headLine;
    private LocalDate dateTime;

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }
}
