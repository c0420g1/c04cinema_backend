package com.example.demo.c04cinema.c04cinema.c04cinema.staff.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.staff.Staff;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.staff.Staff} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedStaffManager extends Manager<Staff> {
    
    TableIdentifier<Staff> IDENTIFIER = TableIdentifier.of("c04cinema", "c04cinema", "staff");
    List<Field<Staff>> FIELDS = unmodifiableList(asList(
        Staff.ID,
        Staff.NAME,
        Staff.ADDRESS,
        Staff.ACCOUNT_ID,
        Staff.THEATRE_ID,
        Staff.EMAIL,
        Staff.PHONE,
        Staff.CARDID,
        Staff.BIRTHDAY,
        Staff.SALARY,
        Staff.POSITION_ID,
        Staff.ISACTIVE,
        Staff.CODE
    ));
    
    @Override
    default Class<Staff> getEntityClass() {
        return Staff.class;
    }
}