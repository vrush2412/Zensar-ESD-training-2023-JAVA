package bvp.entity;


	public abstract class Student {
		private static int rno;
		
		private int rollNo;
		private String name;
		protected int total;
		protected float percent;
//		private int cpp;
//		private int c;
//		private int mp;
//		private int java;
//		private int pcs;
//		private int de;
//		private int edc;
//		private int som;
		
		{
			this.rollNo = ++rno;
		}
		
		public Student() {
			super();
		}

		public Student(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getTotal() {
			return total;
		}

		public void setTotal(int total) {
			this.total = total;
		}

		public float getPercent() {
			return percent;
		}

		public void setPercent(float percent) {
			this.percent = percent;
		}

		public int getRollNo() {
			return rollNo;
		}

		public abstract void calculateTotal();
		public abstract void calculatePercent();
		
		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", name=" + name + ", total=" + total + ", percent=" + percent + "]";
		}
	}
	
	For BeIt
	
	@Override
		public void calculateTotal() {
			this.total = this.c + this.cpp + this.mp + this.java;
		}

		@Override
		public void calculatePercent() {
			this.percent = this.total/4.0f;
		}
	For BeEtc
	@Override
		public void calculateTotal1() {
			this.total = this.pcs + this.de + this.edc + this.som;
		}

		@Override
		public void calculatePercent1() {
			this.percent = this.total/4.0f;
		}
}
