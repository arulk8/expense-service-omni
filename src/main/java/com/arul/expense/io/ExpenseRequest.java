package com.arul.expense.io;

import lombok.*;

import java.math.BigDecimal;
import java.sql.Date;
@Builder
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseRequest {
    private String name;
    private String note;
    private String category;
    private Date date;
    private BigDecimal amount;
}
