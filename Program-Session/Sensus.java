class Sensus 
{
	public static void main(String[] args) 
	{
		long cp=312032486;
		long seconds=(365*24*60*60)*5;

		long birth=seconds/7;
		long death=seconds/13;
		long imm=seconds/45;

		long newPop=cp+birth-death+imm;
		System.out.println(newPop);
	}
}
