package com.lokesh2_autowired.beans;

import java.util.List;

public class Subject {
    List<String> subjects;

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return subjects.toString();
    }
}
