package net.javaguides.springboot.controller;

import net.javaguides.springboot.entities.Employee;
import net.javaguides.springboot.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }
    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee
                                                         employee){
        return new
                ResponseEntity<Employee>(employeeService.saveEmployee(employee),
                HttpStatus.CREATED);
    }
    // build get all employees REST API
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    // build get employee by id REST API
// http://localhost:8080/api/employees/1
    @GetMapping("/test/{id}")
    @ResponseBody
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id")
                                                    long employeeId){
        return new
                ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId),
                HttpStatus.OK);
    }
    // build update employee REST API
// http://localhost:8080/api/employees/1
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id")
                                                   long id
            ,@RequestBody Employee employee){
        return new
                ResponseEntity<Employee>(employeeService.updateEmployee(employee, id),
                HttpStatus.OK);
    }
    // build delete employee REST API
// http://localhost:8080/api/employees/1
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long
                                                         id){
// delete employee from DB
        employeeService.deleteEmployee(id);
        return new ResponseEntity<String>("Employee deleted successfully!.", HttpStatus.OK);
    }
}
