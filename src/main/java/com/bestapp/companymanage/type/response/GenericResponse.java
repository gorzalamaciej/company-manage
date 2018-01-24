package com.bestapp.companymanage.type.response;

public class GenericResponse {
    public enum Status {
        OK,
        ERROR,
        EMPLOYEE_NOT_FOUND
    }

    private String status = Status.OK.toString();
    private String message = "";

    public GenericResponse() {
        super();
    }

    public GenericResponse(String status) {
        super();
        this.status = status;
    }

    public GenericResponse(Status status, String message) {
        this.status = status.name();
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public GenericResponse getStatus(String status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMEssage(String message) {
        this.message = message;
    }
}
