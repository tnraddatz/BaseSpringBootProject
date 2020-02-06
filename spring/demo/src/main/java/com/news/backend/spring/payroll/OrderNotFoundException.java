package com.news.backend.spring.payroll;

class OrderNotFoundException extends RuntimeException {

  OrderNotFoundException(Long id) {
    super("Could not find order" + id);
  }
}