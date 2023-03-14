package ru.top;
import java.util.*;

public class Organization {
    private List<Employee> employees;
    //public String Department = null;

    public Organization() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void updateEmployee(Employee oldEmployee, Employee newEmployee) {
        int index = employees.indexOf(oldEmployee);
        employees.set(index, newEmployee);
    }

    public List<Employee> searchByName(String name) {
        List<Employee> result = new ArrayList<>();
        for(Employee employee : employees) {
            if(employee.getName().equals(name)) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<Employee> searchByPosition(String position) {
        List<Employee> result = new ArrayList<>();
        for(Employee employee : employees) {
            if(employee.getPosition().equals(position)) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<Employee> searchByDepartment(String department) {
        List<Employee> result = new ArrayList<>();
        for(Employee employee : employees) {
            if(employee.getDepartmentName().equals(department)) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<Employee> searchByManager(String managerName) {
        List<Employee> result = new ArrayList<>();
        for(Employee employee : employees) {
            if(employee.getManager() != null && employee.getManager().getName().equals(managerName)) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<Employee> getTopSalaryEmployees(int n) {
        List<Employee> result = new ArrayList<>(employees);
        Collections.sort(result, (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        return result.subList(0, n);
    }

    public List<Employee> getMostExperiencedEmployees(int n) {
        List<Employee> result = new ArrayList<>(employees);
        Collections.sort(result, (e1, e2) -> e2.getHireDate().compareTo(e1.getHireDate()));
        return result.subList(0, n);
    }

    public double getAverageSalary() {
        double sum = 0;
        for(Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum / employees.size();
    }

    public Map<String, Double> getAverageSalaryByDepartment() {
        Map<String, Double> result = new HashMap<>();
        Map<String, Integer> countByDepartment = new HashMap<>();
        for(Employee employee : employees) {
            String department = employee.getDepartmentName();
            double salary = employee.getSalary();
            if(result.containsKey(department)) {
                result.put(department, result.get(department) + salary);
                countByDepartment.put(department, countByDepartment.get(department) + 1);
            } else {
                result.put(department, salary);
                countByDepartment.put(department, 1);
            }
        }
        for(String department : result.keySet()) {
            result.put(department, result.get(department) / countByDepartment.get(department));
        }
        return result;
    }

    public Map<String, List<Employee>> getEmployeesByDepartment() {
        Map<String, List<Employee>> result = new HashMap<>();
        for(Employee employee : employees) {
            String department = employee.getDepartmentName();
            if(result.containsKey(department)) {
                result.get(department).add(employee);
            } else {
                List<Employee> employees = new ArrayList<>();
                employees.add(employee);
                result.put(department, employees);
            }
        }
        return result;
    }

    /*public Map<String, String> getManagersByDepartment() {
        Map<String, String> result = new HashMap<>();
        for (Department dept : departments) {
            if (dept.getManager() != null) {
                result.put(dept.getName(), dept.getManager().getName());
            }
        }
        return result;
    }*/

}
