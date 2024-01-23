package com.example.employeeManagementSystem.model;


import com.example.employeeManagementSystem.Utils.ResponseStatusEnum;

import lombok.Data;
@Data
public class ResultResponse {
    private int code;
    private  ResponseStatusEnum status;
    private String message;
    private Object data;
}
