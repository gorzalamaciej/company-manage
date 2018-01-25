package com.bestapp.companymanage.exception;

public class MappedException extends RuntimeException {

  private String errorCode;

  private String message;

  public MappedException(ErrorCodes errorCode) {
    this.errorCode = errorCode.name();
  }

  public MappedException(String errorCode, String message) {
    this.errorCode = errorCode;
    this.message = message;
  }

  public MappedException(ErrorCodes errorCode, String message) {
    this.errorCode = errorCode.name();
    this.message = message;
  }

  public String getErrorCode() {
    return this.errorCode;
  }

  public String getMessage() {
    return this.message;
  }

  public enum ErrorCodes {
    EMPLOYEE_NOT_FOUND_EXCEPTION
  }
}
