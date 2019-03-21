package com.jontromanob.app.khorchapati.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Hi on 5/22/2018.
 */
public class MyAttendanceList {

    @SerializedName("DailyAttendanceId")
    @Expose
    public Integer dailyAttendanceId;
    @SerializedName("CompanyId")
    @Expose
    public Integer companyId;
    @SerializedName("EmployeeId")
    @Expose
    public Integer employeeId;
    @SerializedName("InTimeLat")
    @Expose
    public Object inTimeLat;
    @SerializedName("InTimeLong")
    @Expose
    public Object inTimeLong;
    @SerializedName("OutTimeLat")
    @Expose
    public Object outTimeLat;
    @SerializedName("OutTimeLong")
    @Expose
    public Object outTimeLong;
    @SerializedName("InTimeAddress")
    @Expose
    public Object inTimeAddress;
    @SerializedName("OutTimeAddress")
    @Expose
    public Object outTimeAddress;
    @SerializedName("AttendanceDate")
    @Expose
    public String attendanceDate;
    @SerializedName("AttendanceDate_String")
    @Expose
    public String attendanceDateString;
    @SerializedName("InTime")
    @Expose
    public Object inTime;
    @SerializedName("InTime_String")
    @Expose
    public String inTimeString;
    @SerializedName("OutTime")
    @Expose
    public Object outTime;
    @SerializedName("OutTime_String")
    @Expose
    public String outTimeString;
    @SerializedName("InTimeTerminal")
    @Expose
    public Object inTimeTerminal;
    @SerializedName("OutTimeTerminal")
    @Expose
    public Object outTimeTerminal;
    @SerializedName("InTimeRemarks")
    @Expose
    public Object inTimeRemarks;
    @SerializedName("OutTimeRemarks")
    @Expose
    public Object outTimeRemarks;
    @SerializedName("EmployeeCode")
    @Expose
    public String employeeCode;
    @SerializedName("EmployeeName")
    @Expose
    public String employeeName;
    @SerializedName("JoinDate")
    @Expose
    public String joinDate;
    @SerializedName("JobStatus")
    @Expose
    public Object jobStatus;
    @SerializedName("Designation")
    @Expose
    public Object designation;
    @SerializedName("BranchName")
    @Expose
    public String branchName;
    @SerializedName("DivisionName")
    @Expose
    public String divisionName;
    @SerializedName("DepartmentName")
    @Expose
    public String departmentName;
    @SerializedName("Flag")
    @Expose
    public String flag;
    @SerializedName("CD")
    @Expose
    public String cD;
    @SerializedName("MD")
    @Expose
    public String mD;
    @SerializedName("CB")
    @Expose
    public Integer cB;
    @SerializedName("MB")
    @Expose
    public Integer mB;
    @SerializedName("Rows")
    @Expose
    public Integer rows;
    @SerializedName("MessageType")
    @Expose
    public Integer messageType;
    @SerializedName("MessageString")
    @Expose
    public Object messageString;

    public Integer getDailyAttendanceId() {
        return dailyAttendanceId;
    }

    public void setDailyAttendanceId(Integer dailyAttendanceId) {
        this.dailyAttendanceId = dailyAttendanceId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Object getInTimeLat() {
        return inTimeLat;
    }

    public void setInTimeLat(Object inTimeLat) {
        this.inTimeLat = inTimeLat;
    }

    public Object getInTimeLong() {
        return inTimeLong;
    }

    public void setInTimeLong(Object inTimeLong) {
        this.inTimeLong = inTimeLong;
    }

    public Object getOutTimeLat() {
        return outTimeLat;
    }

    public void setOutTimeLat(Object outTimeLat) {
        this.outTimeLat = outTimeLat;
    }

    public Object getOutTimeLong() {
        return outTimeLong;
    }

    public void setOutTimeLong(Object outTimeLong) {
        this.outTimeLong = outTimeLong;
    }

    public Object getInTimeAddress() {
        return inTimeAddress;
    }

    public void setInTimeAddress(Object inTimeAddress) {
        this.inTimeAddress = inTimeAddress;
    }

    public Object getOutTimeAddress() {
        return outTimeAddress;
    }

    public void setOutTimeAddress(Object outTimeAddress) {
        this.outTimeAddress = outTimeAddress;
    }

    public String getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(String attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public String getAttendanceDateString() {
        return attendanceDateString;
    }

    public void setAttendanceDateString(String attendanceDateString) {
        this.attendanceDateString = attendanceDateString;
    }

    public Object getInTime() {
        return inTime;
    }

    public void setInTime(Object inTime) {
        this.inTime = inTime;
    }

    public String getInTimeString() {
        return inTimeString;
    }

    public void setInTimeString(String inTimeString) {
        this.inTimeString = inTimeString;
    }

    public Object getOutTime() {
        return outTime;
    }

    public void setOutTime(Object outTime) {
        this.outTime = outTime;
    }

    public String getOutTimeString() {
        return outTimeString;
    }

    public void setOutTimeString(String outTimeString) {
        this.outTimeString = outTimeString;
    }

    public Object getInTimeTerminal() {
        return inTimeTerminal;
    }

    public void setInTimeTerminal(Object inTimeTerminal) {
        this.inTimeTerminal = inTimeTerminal;
    }

    public Object getOutTimeTerminal() {
        return outTimeTerminal;
    }

    public void setOutTimeTerminal(Object outTimeTerminal) {
        this.outTimeTerminal = outTimeTerminal;
    }

    public Object getInTimeRemarks() {
        return inTimeRemarks;
    }

    public void setInTimeRemarks(Object inTimeRemarks) {
        this.inTimeRemarks = inTimeRemarks;
    }

    public Object getOutTimeRemarks() {
        return outTimeRemarks;
    }

    public void setOutTimeRemarks(Object outTimeRemarks) {
        this.outTimeRemarks = outTimeRemarks;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public Object getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Object jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Object getDesignation() {
        return designation;
    }

    public void setDesignation(Object designation) {
        this.designation = designation;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getcD() {
        return cD;
    }

    public void setcD(String cD) {
        this.cD = cD;
    }

    public String getmD() {
        return mD;
    }

    public void setmD(String mD) {
        this.mD = mD;
    }

    public Integer getcB() {
        return cB;
    }

    public void setcB(Integer cB) {
        this.cB = cB;
    }

    public Integer getmB() {
        return mB;
    }

    public void setmB(Integer mB) {
        this.mB = mB;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public Object getMessageString() {
        return messageString;
    }

    public void setMessageString(Object messageString) {
        this.messageString = messageString;
    }

    public Object getMessageDetails() {
        return messageDetails;
    }

    public void setMessageDetails(Object messageDetails) {
        this.messageDetails = messageDetails;
    }

    @SerializedName("MessageDetails")
    @Expose

    public Object messageDetails;
}
