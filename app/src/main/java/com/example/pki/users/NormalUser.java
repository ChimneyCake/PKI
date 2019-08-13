package com.example.pki.users;

import com.example.pki.jobService.Service;

import java.util.List;

public class NormalUser extends User {

    private List<Service> serviceHistory;
    private List<Service> serviceFuture;

    public void workDone(Service service) {
        Service serviceDone = getServiceById(service.getId(), serviceFuture);
        if (serviceDone != null) {
            removeServiceById(service.getId(), serviceFuture);
        }
        serviceHistory.add(serviceDone);
    }

    private Service getServiceById(int id, List<Service> list) {
        for (Service service : list) {
            if (service.getId() == id)
                return service;
        }
        return null;
    }

    private boolean removeServiceById(int id, List<Service> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public void rateRepairman(Repairman repairman)
    {

    }

}
