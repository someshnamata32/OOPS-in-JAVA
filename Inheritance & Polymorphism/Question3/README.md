3. Design an employee hierarchy with multiple levels of inheritance. There are three
types of employees: Employee (base class), Manager (inherits from Employee), and
Director (inherits from Manager). Each employee has a name, employee ID, and a
method to display their details. You can use constructor or setter methods to initialize
the data members.
Data Members:
• Employee: name (String), employeeId (int)
• Manager: teamSize (int)
• Director: department (String)
Member Functions:
• Employee: displayDetails()
• Manager: displayDetails() (overrides the base class method)
• Director: displayDetails() (overrides the manager's method)
