package SpringIOC.SpringIOCExamples;


public class PlayerPojo {
	
	private int ranking;
	private Format format;
	private String name;
	private String catagory;
	private int age;
	
	
	public PlayerPojo(int ranking, Format format, String name, String catagory, int age) {
		super();
		this.ranking = ranking;
		this.format = format;
		this.name = name;
		this.catagory = catagory;
		this.age = age;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "PlayerPojo [ranking=" + ranking + ", format=" + format + ", name=" + name + ", catagory=" + catagory
				+ ", age=" + age + "]";
	}

}
