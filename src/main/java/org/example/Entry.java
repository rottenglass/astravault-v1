package org.example;

import java.time.LocalDate;

public class Entry {
    private int id;
    private String title;
    private Category category;
    private LocalDate dateLearned;
    private LocalDate[] dateRecalled;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getDateLearned() {
        return dateLearned;
    }

    public void setDateLearned(LocalDate dateLearned) {
        this.dateLearned = dateLearned;
    }

    public LocalDate[] getDateRecalled() {
        return dateRecalled;
    }

    public void setDateRecalled(LocalDate[] dateRecalled) {
        this.dateRecalled = dateRecalled;
    }
}
