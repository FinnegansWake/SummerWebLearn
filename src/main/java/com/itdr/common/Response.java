package com.itdr.common;

import java.io.Serializable;

public class Response<E> implements Serializable {
    private final int status;
    private String message;
    private E data;

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public E getData() {
        return data;
    }

    /**
     * Failure condition
     * @param status
     * @param message
     */
    private Response(int status, String message) {
        this.status = status;
        this.message = message;
    }

    /**
     * Success condition
     * @param data
     */
    private Response(E data) {
        this.status = 200;
        this.data = data;
    }

    public static <E> Response toSuccess(E data) {
        return new Response(data);
    }

    public static <E> Response toFailure(int status, String message) {
        return new Response(status, message);
    }
}
