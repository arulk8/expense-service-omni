package com.arul.expense.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

    @GetMapping("/expenses")
    public String getExpense(){
        return "Getting the response from rest";
    }
}
