package com.arul.expense.dto;
import lombok.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Builder
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseDTO {
    private String expenseId;
    private String name;
    private String note;
    private String category;
    private Date date;
    private BigDecimal amount;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}