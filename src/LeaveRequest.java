import java.util.*;

enum LeaveStatus {
    PENDING, APPROVED, REJECTED
}

abstract class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    abstract boolean isLeaveAllowed(int days);
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name) {
        super(name);
    }

    public boolean isLeaveAllowed(int days) {
        return days <= 20;
    }
}

class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name) {
        super(name);
    }

    public boolean isLeaveAllowed(int days) {
        return days <= 10;
    }
}

class Contractor extends Employee {
    public Contractor(String name) {
        super(name);
    }

    public boolean isLeaveAllowed(int days) {
        return false;
    }
}

class LeaveRequest {
    Employee employee;
    int days;
    String dateString;
    LeaveStatus status;

    public LeaveRequest(Employee employee, int days, String dateString) {
        this.employee = employee;
        this.days = days;
        this.dateString = dateString;
        this.status = LeaveStatus.PENDING;
        System.out.println(this.employee.getClass().getSimpleName() + " " + this.employee.name + " submits leave request for " + this.days + " days (" + this.dateString + ").");
    }

    public void approve() {
        if (this.status != LeaveStatus.PENDING) {
            System.out.println("Cannot change status. Request is already " + this.status + ".");
            return;
        }
        this.status = LeaveStatus.APPROVED;
        System.out.println("Leave request for " + this.employee.name + " (" + this.dateString + ") Approved.");
    }

    public void reject() {
        if (this.status != LeaveStatus.PENDING) {
            System.out.println("Cannot change status. Request is already " + this.status + ".");
            return;
        }
        this.status = LeaveStatus.REJECTED;
        System.out.println("Leave request for " + this.employee.name + " (" + this.dateString + ") Rejected.");
    }
}

class Reviewer {
    String name;

    public Reviewer(String name) {
        this.name = name;
    }

    public void review(LeaveRequest request, boolean managerDecision) {
        System.out.print("Manager " + this.name + " reviews " + request.employee.name + "'s request: ");

        if (request.status != LeaveStatus.PENDING) {
            System.out.println("Request already processed.");
            return;
        }

        if (managerDecision && request.employee.isLeaveAllowed(request.days)) {
            request.approve();
        } else {
            request.reject();
        }
    }
}



