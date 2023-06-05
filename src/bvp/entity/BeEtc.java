package bvp.entity;


	public class BeEtc extends Student{
		private int pcs;
		private int de;
		private int som;
		private int edc;
		
		public BeEtc() {
			super();
		}

		public BeEtc(String name, int pcs, int de, int som, int edc) {
			super(name);
			this.pcs = pcs;
			this.de = de;
			this.som = som;
			this.edc = edc;
		}

		public int getPcs() {
			return pcs;
		}

		public void setPcs(int pcs) {
			this.pcs = pcs;
		}

		public int getDe() {
			return de;
		}

		public void setDe(int de) {
			this.de = de;
		}

		public int getSom() {
	return som;
		}

		public void setSom(int som) {
			this.som = som;
		}

		public int getEdc() {
			return edc;
		}

		public void setEdc(int edc) {
			this.edc = edc;
		}

		@Override
		public String toString() {
			return super.toString() + "BeEtc [pcs=" + pcs + ", de=" + de + ", som=" + som + ", edc=" + edc + "]";
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