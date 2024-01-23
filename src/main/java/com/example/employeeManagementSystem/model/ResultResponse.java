package com.example.employeeManagementSystem.model;


import com.example.employeeManagementSystem.Utils.ResponseStatusEnum;

public class ResultResponse {
    private int code;
    private  ResponseStatusEnum status;
    private String message;
    private Object data;
}
