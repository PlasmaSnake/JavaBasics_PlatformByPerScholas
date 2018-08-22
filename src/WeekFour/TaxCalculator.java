package WeekFour;

public class TaxCalculator {
	public static double calculateTax(String empName, boolean isIndian, double empSal) {
		double taxAmount = 0;
		try {
			
			if (!isIndian) throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
			if (empName.isEmpty() || empName == null) throw new EmployeeNameInvalidException("The Employee name cannot be empty.");
			
			if(isIndian) {
				if (empSal > 100000) {
					taxAmount = empSal * .08;
				}
				else if (empSal > 50000 && empSal <= 100000) {
					taxAmount = empSal * .06;
				}
				else if (empSal > 30000 && empSal <= 50000) {
					taxAmount = empSal * .05;
				}
				else if (empSal > 10000 && empSal <= 30000) {
					taxAmount = empSal * .04;
				}
				else throw new TaxNotEligibleException("The employee does not need to pay tax.");
				
			}
		}
		catch(CountryNotValidException e1) {
			System.out.println(e1.getMessage());
		}
		catch(EmployeeNameInvalidException e2) {
			System.out.println(e2.getMessage());
		}
		catch(TaxNotEligibleException e3) {
			System.out.println(e3.getMessage());
		}
		return taxAmount;
	}
}
