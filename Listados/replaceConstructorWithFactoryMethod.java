// Problem
class Employee {
  Employee(int type) {
    this.type = type;
  }
  // ...
}

// Solution


class Employee {
  static Employee create(int type) {
    employee = new Employee(type);
    // do some heavy lifting.
    return employee;
  }
  // ...
}
