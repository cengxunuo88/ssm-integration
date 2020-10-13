package com.lg.service;

import com.lg.entity.Employee;
import com.lg.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Cengxunuo
 * @date 2020/10/13 13:45
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public int insertEmployee(Employee employee) {
        return employeeMapper.insertEmployee(employee);
    }
}
