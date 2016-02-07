package com.falexo.reminder.app.dto;

/**
 * Created by newman on 07.02.2016.
 */
public class RemindDTO {
    private String title;

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
