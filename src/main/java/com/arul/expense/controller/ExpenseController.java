package com.arul.expense.controller;

import com.arul.expense.dto.ExpenseDTO;
import com.arul.expense.io.ExpenseResponse;
import com.arul.expense.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This is controller class for expense module
 * @author Arulmurugan K
 * */
@RestController
@RequiredArgsConstructor
@Slf4j
@CrossOrigin("*")
public class ExpenseController {
    private final ModelMapper modelMapper;
    private final ExpenseService expenseService;
    /**
     * It will fetch the expenses from expense service
     * @return list
     * */
    @GetMapping("/expenses")
    public List<ExpenseResponse> getExpense(){
        List<ExpenseDTO> dtoList = expenseService.getAllExpenses();
        log.info("Printing the data which came from service layer {}", dtoList);
        List<ExpenseResponse> response = dtoList.stream().map( expenseDTO ->  mapDTOtoResponse(expenseDTO)).collect(Collectors.toList());
        return response;
    }

    /**
     * Mapper method for converting Expense dto object Expense response
     * @param expenseDTO
     * @return ExpenseResponse
     * */
    private ExpenseResponse mapDTOtoResponse(ExpenseDTO dto){
        return modelMapper.map(dto, ExpenseResponse.class);
    }
}
