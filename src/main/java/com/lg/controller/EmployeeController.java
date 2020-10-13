package com.lg.controller;

import com.lg.entity.Employee;
import com.lg.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Cengxunuo
 * @date 2020/10/13 13:45
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(path = "/employee", method = RequestMethod.POST)
    public String insertEmployee(Employee employee) {
        employeeService.insertEmployee(employee);
//        int a= 1/0;
        return "success";
    }

}
