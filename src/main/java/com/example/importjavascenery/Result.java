package com.example.importjavascenery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private int code;
    private String message;
    private Object data;

    public static Result success(Object data) {
        return new Result(200, "操作成功", data);
    }

    public static Result error(String message) {
        return new Result(500, message, null);
    }
}
