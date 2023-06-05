package bvp.entity;

public class Belt {
	public  class BeIt extends Student {
		private int c;
		private int cpp;
		private int java;
		private int mp;
		
		public BeIt() {
			super();
		}

		public BeIt(String name, int c, int cpp, int java, int mp) {
			super();
			this.c = c;
			this.cpp = cpp;
			this.java = java;
			this.mp = mp;
		}

		public int getC() {
			return c;
		}

		public void setC(int c) {
			this.c = c;
		}

		public int getCpp() {
			return cpp;
		}

		public void setCpp(int cpp) {
			this.cpp = cpp;
		}

		public int getJava() {
			return java;
		}

		public int getMp() {
			return mp;
		}

		public void setMp(int mp) {
			this.mp = mp;
		}
 
		@Override
		public String toString() {
			return super.toString() + "BeIt [c=" + c + ", cpp=" + cpp + ", java=" + java + ", mp=" + mp + "]";
		}

		@Override
		public void calculateTotal() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void calculatePercent() {
			// TODO Auto-generated method stub
			
		}

	}
}
