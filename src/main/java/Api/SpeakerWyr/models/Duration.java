package Api.SpeakerWyr.models;


public enum Duration {
	
	LIGHTNING (900, "15 minutes or less"),
	SHORT (901, "15 to 30 minutes"),
	MID (902, "30 to 60 minutes"),
	LONG (903, "60 minutes or more");
	
//	private final Long id;
//	private final String displayDuration;
	
	public String displayDuration;
	public Integer id;
	
	private Duration(Integer id, String displayDuration){
		this.displayDuration = displayDuration;
		this.id = id;
	}
	
//	private Duration (String displayDuration) {
//		this.displayDuration = displayDuration;
//	}
	
	public String getDisplayDuration() {
		return displayDuration;
	}
	
	public static Duration getDurationById(Integer id) {
//		switch(id) {
//		case 900:
//			return Duration.LIGHTNING;
//		case 901:
//			return Duration.SHORT;
//		case 902:
//			return Duration.MID;
//		case 903:
//			return Duration.LONG;
//		}
		return Duration.LONG;
	}
	
	public Integer getDurationId() {
		return id;
	}
	
	
	
}
