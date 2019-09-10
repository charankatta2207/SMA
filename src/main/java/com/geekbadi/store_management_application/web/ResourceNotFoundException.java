package com.geekbadi.store_management_application.web;

public class ResourceNotFoundException extends RuntimeException
{
    public ResourceNotFoundException(String product, String id, Long productId) {
    }
}
