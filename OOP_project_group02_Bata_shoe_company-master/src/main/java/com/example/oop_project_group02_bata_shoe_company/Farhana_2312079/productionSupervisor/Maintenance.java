package com.example.oop_project_group02_bata_shoe_company.Farhana_2312079.productionSupervisor;

import java.time.LocalDate;

public class Maintenance {

     private String machineId,machineName,currentStatus,issueDesc,urgencyLvl,expDowntime;
     private LocalDate lastMaintenanceDate;

    public Maintenance(String machineId, String machineName, String currentStatus, String issueDesc, String urgencyLvl, String expDowntime, LocalDate lastMaintenanceDate) {
        this.machineId = machineId;
        this.machineName = machineName;
        this.currentStatus = currentStatus;
        this.issueDesc = issueDesc;
        this.urgencyLvl = urgencyLvl;
        this.expDowntime = expDowntime;
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getIssueDesc() {
        return issueDesc;
    }

    public void setIssueDesc(String issueDesc) {
        this.issueDesc = issueDesc;
    }

    public String getUrgencyLvl() {
        return urgencyLvl;
    }

    public void setUrgencyLvl(String urgencyLvl) {
        this.urgencyLvl = urgencyLvl;
    }

    public String getExpDowntime() {
        return expDowntime;
    }

    public void setExpDowntime(String expDowntime) {
        this.expDowntime = expDowntime;
    }

    public LocalDate getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setLastMaintenanceDate(LocalDate lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    @Override
    public String toString() {
        return "Maintenance{" +
                "machineId='" + machineId + '\'' +
                ", machineName='" + machineName + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                ", issueDesc='" + issueDesc + '\'' +
                ", urgencyLvl='" + urgencyLvl + '\'' +
                ", expDowntime='" + expDowntime + '\'' +
                ", lastMaintenanceDate=" + lastMaintenanceDate +
                '}';
    }
}
