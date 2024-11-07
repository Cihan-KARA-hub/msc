package com.msc.businessmanagement.api.mapper;


import com.msc.businessmanagement.api.dto.EmployeeDto;
import com.msc.businessmanagement.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class EmployeeMapper {
    public abstract EmployeeDto employeeToEmployeeDto(Employee employee);

    public abstract EmployeeDto employeeDtoToEmployee(EmployeeDto employeeDto);
}
