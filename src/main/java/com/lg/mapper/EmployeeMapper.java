package com.lg.mapper;

import com.lg.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

/**
 * @author Cengxunuo
 * @date 2020/10/13 13:45
 */
@Repository
public interface EmployeeMapper {

    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    @Insert(value = "insert into " +
            "employee(name,age,sex,address,phone,password) " +
            "values(#{name}, #{age},  #{sex}, #{address}, #{phone}, #{password} )")
    int insertEmployee(Employee employee);


}
