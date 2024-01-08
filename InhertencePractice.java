package practice1;

	class Doctor {
		 void Doctor_Details() {
		  System.out.println("Doctor Details...");
		 }
		}

		class Surgeon extends Doctor {
		 void Surgeon_Details() {
		  System.out.println("Surgen Detail...");
		 }
		}
		public class InhertencePractice {
		 public void main(String args[]) {
		  Surgeon s = new Surgeon();
		  s.Doctor_Details();
		  s.Surgeon_Details();
		 
		}
	

}
