package lab5;

class Employee{
 private String fname;
 private String lname;
    
   public String getFname(){
          return fname;
   }
   public String getLname(){
          return lname;
   } 
   public void setFname(String fname){
        this.fname=fname;
   } 
   public void setLname(String lname){
        this.lname=lname;
   } 
 
 
} 
 
 
class InvalidNameException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidNameException(String s) {
        super(s);
    }
} 
public class ex4 {
    void processName(String fname, String lname) throws InvalidNameException {
         if (fname.isEmpty() &&  lname.isEmpty()) {
            throw new InvalidNameException("Employee First and last name missing");
        }     else if(fname.isEmpty()){
            throw new InvalidNameException("Employee First name is missing");
        }
         else  if(lname.isEmpty()){
            throw new InvalidNameException("Employee Last name is missing");
        }
    }
    public static void main(String[] s) {
        Employee employee=new Employee();
     employee.setFname("");
     employee.setLname("");
    
        ex4 ck = new ex4();
        try {
            ck.processName(employee.getFname(),employee.getLname());
 System.out.println("Employee name is "+employee.getFname()+" "+employee.getLname());
        } catch (InvalidNameException e) {
            System.out.println("Invalid Name " + e.getMessage());
        }
    }
}