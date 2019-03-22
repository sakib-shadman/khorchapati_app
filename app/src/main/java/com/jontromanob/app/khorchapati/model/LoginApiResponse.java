package com.jontromanob.app.khorchapati.model;

/**
 * Created by Hi on 3/22/2019.
 */

public class LoginApiResponse {

    private LogInResponse logInResponse;
    private Status status;

    public LogInResponse getLogInResponse() {
        return logInResponse;
    }

    public void setLogInResponse(LogInResponse logInResponse) {
        this.logInResponse = logInResponse;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
