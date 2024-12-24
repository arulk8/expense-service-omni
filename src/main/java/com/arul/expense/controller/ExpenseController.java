package com.arul.expense.controller;

import com.arul.expense.dto.ExpenseDTO;
import com.arul.expense.io.ExpenseResponse;
import com.arul.expense.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class ExpenseController {
    private final ModelMapper modelMapper;
    private final ExpenseService expenseService;
    @GetMapping("/expenses")
    public List<ExpenseResponse> getExpense(){
        List<ExpenseDTO> dtoList = expenseService.getAllExpenses();
        List<ExpenseResponse> response = dtoList.stream().map( expenseDTO ->  mapDTOtoResponse(expenseDTO)).collect(Collectors.toList());
        return response;
    }

    private ExpenseResponse mapDTOtoResponse(ExpenseDTO dto){
        return modelMapper.map(dto, ExpenseResponse.class);
    }
}
