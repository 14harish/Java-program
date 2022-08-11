package Practise;

	class Student{
		int regno;
		String name;
		
		public void setRegno(int regno) {
			this.regno=regno;
		}
		public void setName(String name) {
			this.name=name;
		}
//		public void setAlldetails(int regno,String name) {
//			this.regno=regno;
//			this.name=name;
//		}
		public int getRegno() {
			return regno;
		}
		public String getName() {
			return name;
		}
//		printing all using is not possible because the datatype differs();
//		public int getAlldetails() {
//			return regno;
//			return name;
//		}
	}
	public class EncapluationEx { 
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("harish");
		s.setRegno(30);
		System.out.println("Name:"+s.getName()+"\n"+"RegNo:"+s.getRegno());
		s.setName("Arun");
		s.setRegno(501);
		System.out.println("Name:"+s.getName()+"\n"+"RegNo:"+s.getRegno());
		
		
	}
	}
