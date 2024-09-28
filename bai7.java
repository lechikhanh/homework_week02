package week_02;
	class Person {
		private String name;
		private int age;
		private String address;
		public Person(String name, int age, String address) {
			this.name = name;
			this.age = age;
			this.address = address;
}
		public void displayInfo() {
			System.out.println("* ");
			System.out.println("Tên: " + name);
			System.out.println("Tuổi: " + age);
			System.out.println("Địa chỉ: " + address);
 }
}
	class Teacher extends Person {
		private String institution_Name;
		private String[] courses;
		public Teacher(String name, int age, String address, String institution_Name, String[] courses) {
			super(name, age, address);
			this.institution_Name = institution_Name;
			this.courses = courses;
 }
		public void displayInfo() {
			super.displayInfo();
			System.out.println("Tên cơ sở giáo dục: " + institution_Name);
			System.out.print("Danh sách khóa học: ");
			for (String course : courses) {
			System.out.print(course + " ");
     }
			System.out.println();
 }
}
	public class bai7 {
		public static void main(String[] args) {
			String[] courses1 = {"Tin học cơ bản", "Pháp luật đại cương"};
			Teacher teacher1 = new Teacher("Phạm Đăng Khoa", 18, "147 Lê Đại Hành, Đà Nẵng", "Trường Đại học Sư Phạm", courses1);
			String[] courses2 = {"Công Nghệ Máy tính", "Lập Trình Web"};
			Teacher teacher2 = new Teacher("Trần Thị Diễm My", 18, "298 Trường Chinh, Quảng Nam", "Trường Cao Đẳng FPT", courses2);
			String[] courses3 = {"Toán cao cấp", "Giải Tích"};
			Teacher teacher3 = new Teacher("Trần Ngọc Bảo Trân", 18, "k38/08 Phạm Nhữ Tăng, Đà Nẵng", "Trường Đại học Bách Khoa", courses3);			
			teacher1.displayInfo();
			teacher2.displayInfo();
			teacher3.displayInfo();
 }
}



