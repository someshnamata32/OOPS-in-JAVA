7. Develop an employee hierarchy using abstract classes. Design a base class Employee
with related properties and two abstract methods calculateSalary() and
displayDetails(). Derive two classes Manager and Engineer from Employee. Implement
the abstract methods in the derived classes. Use constructors to initialize the data
memebrs.
Data Members:
• Employee: name (String), employeeId (int), baseSalary (double)
• Manager: teamSize (int), projectManaged (int)
• Engineer: programmingLanguage (String), yearsOfExperience (int)
Member Functions:
• Employee: double calculateSalary(), void displayDetails() (Abstract Methods)
• Manager:
i. calculateSalary(): baseSalary + temSize * 1000 + projectManaged * 2000
ii. displayDetails(): Id, Name, Base Salary, Team Size, Number of Projects
Managed and Total salary
• Engineer:
i. calculateSalary(): baseSalary + yearsOfExperience * 500
ii. displayDetails(): Id, Name, Programming Languages, Years of Experience,
Base Salary and Total salary
