package com.bestapp.companymanage.type.response;

public class GenericResponse {
    public enum Code {
        OK
    }

    private String code = Code.OK.toString();
    private String message = "";

    public GenericResponse() {
        super();
    }

    public GenericResponse(String code) {
        super();
        this.code = code;
    }

    public GenericResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public GenericResponse(Code code, String message) {
        this.code = code.name();
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public GenericResponse getCodes(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
