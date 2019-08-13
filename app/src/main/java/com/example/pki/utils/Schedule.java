package com.example.pki.utils;

import com.example.pki.users.User;

import java.util.Date;
import java.util.List;

public class Schedule {
    private List<BusyDates> busyDates;



    private class BusyDates{
        private Date busyFrom;
        private Date busyTo;
        private User userToVisit;
    }
}
