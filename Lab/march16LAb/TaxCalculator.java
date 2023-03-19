package march16LAb;

public class TaxCalculator {

	 double calculateTax(String empName,boolean isIndian,double  empSal)
 
		throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException
		{
		double taxAmount=0.0; //declares a double variable to store tax
		if(!isIndian) {
			throw new CountryNotValidException("The emp should be an indian citizen to calculate a tax");
		}
		//check the employee name is null or empty
		if(empName==null || empName.isEmpty()) {
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}
		if(empSal >100000 && isIndian)
		{		
			taxAmount= empSal*8/100;
		}
		else if(empSal>=500000 && empSal<=100000 &&isIndian)
		{
			taxAmount= empSal*6/100;
		}
		else if(empSal>=30000 && empSal<=50000 && isIndian)
		{
			taxAmount= empSal*5/100;
		}
		else if(empSal>=10000 && empSal<=30000 && isIndian)
		{
			taxAmount= empSal*4/100;
		}
		else
		{
			throw new TaxNotEligibleException("the employee doesnot need to pay tax");
		}
		
	
		return taxAmount;
		
}
}
