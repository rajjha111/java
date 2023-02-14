package anudip;
class student{
	private int sid;
	private String name;
	private String school;
	private long phone;
	public void setsid(int sid) {
		this.sid=sid;
	}
	public int getsid() {
		return sid;
	}
	
	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	
	
	public void setschool(String school) {
		this.school=school;
	}
	public String getschool() {
		return school;
	}
	public void setphone(long phone) {
		this.phone=phone;
	}
	public long getphone() {
		return phone;
	}
	
}

public class EnscapuslationExample {
	public static void main (String args[]) {
	student st=new student();
	st.setsid(32107);
	st.setname("raj");
	st.setschool("ssv");
	st.setphone(7869);
	System.out.println("value are" + "    "+ st.getsid()+" "+st.getname()+" "+st.getphone()+" "+st.getschool());
	}
	

}
