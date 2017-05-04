public class EmployeeDetails {
    public static void main(String args[]) {
        String firstName = "Steve";
        String lastName = "Jobs";
        String designation = "CEO cum iOS Developer";
        String dateOfBirth = "24-02-1955";
        boolean gender = true;
        double basicPay = 2000000;
        double houseRentAllowance = basicPay * (23.0 / 100.0);
        double travelAllowance = basicPay * (10.0 / 100.0);
        double dearnessAllowance = basicPay * (15.0 / 100.0);
        double providantFund = basicPay * (18.0 / 100.0);
        double netPay = basicPay + houseRentAllowance + travelAllowance + dearnessAllowance - providantFund;
        System.out.println("First Name              : " + firstName);
        System.out.println("Last Name               : " + lastName);
        System.out.println("Designation             : " + designation);
        System.out.println("Date of Birth           : " + dateOfBirth);
        System.out.println("Gender                  : " + (gender? "Male": "Female"));
        System.out.println("Basic Payment           : " + basicPay);
        System.out.println("House Rent Allowance    : " + houseRentAllowance);
        System.out.println("Travel Allowance        : " + travelAllowance);
        System.out.println("Dearness Allowance      : " + dearnessAllowance);
        System.out.println("Providant Fund          : " + providantFund);
        System.out.println("Salary                  : " + netPay);
    }
}
