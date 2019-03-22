package com.jontromanob.app.khorchapati.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by Hi on 1/11/2018.
 */

public class LogInResponse {

    @SerializedName("UserName")
    @Expose
    public String userName;
    @SerializedName("UserCategory")
    @Expose
    public String userCategory;
    @SerializedName("access_token")
    @Expose
    private String accessToken;
    @SerializedName("token_type")
    @Expose
    private String tokenType;
    @SerializedName("expires_in")
    @Expose
    private Integer expiresIn;
    @SerializedName("refresh_token")
    @Expose
    private String refresh_token;
    @SerializedName("UserId")
    @Expose
    private String userId;
    @SerializedName("CompanyId")
    @Expose
    private String companyId;
    @SerializedName("DateFormat")
    @Expose
    private String dateFormat;
    @SerializedName("EmployeeId")
    @Expose
    private String employeeId;
    @SerializedName("UserCategoryId")
    @Expose
    private String userCategoryId;
    @SerializedName("IsTransportManager")
    @Expose
    private String isTransportManager;
    @SerializedName("DriverId")
    @Expose
    private String driverId;
    @SerializedName("UserImageUrl")
    @Expose
    private String userImageUrl;
    @SerializedName("EmployeeName")
    @Expose
    private String employeeName;
    @SerializedName("Designation")
    @Expose
    private String designation;
    @SerializedName(".issued")
    @Expose
    private String issued;
    @SerializedName(".expires")
    @Expose
    private String expires;

    private String status;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(String userCategory) {
        this.userCategory = userCategory;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getUserCategoryId() {
        return userCategoryId;
    }

    public void setUserCategoryId(String userCategoryId) {
        this.userCategoryId = userCategoryId;
    }

    public String getIsTransportManager() {
        return isTransportManager;
    }

    public void setIsTransportManager(String isTransportManager) {
        this.isTransportManager = isTransportManager;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getIssued() {
        return issued;
    }

    public void setIssued(String issued) {
        this.issued = issued;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
