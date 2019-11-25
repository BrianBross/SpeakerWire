package Api.SpeakerWyr.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Talk {
	
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String description;
	private Duration duration;
	@OneToOne
	private Speaker speaker;
	@OneToMany(mappedBy = "talks")
	private List<Genre> genres;
	@OneToMany(mappedBy = "talks")
	private List<Tag> tags;
	private String iFrame;
	@ManyToOne
	private Event event;
	
	public Talk() {}
	
	public Talk(String title, String description, Duration duration, Speaker speaker) {	
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.speaker = speaker;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Duration getDuration() {
		return duration;
	}
	
	public Speaker getSpeaker() {
		return speaker;
	}
	
	public List<Genre> getGenres() {
		return genres;
	}
	
	public List<Tag> getTags() {
		return tags;
	}
	
	public String getiFrame() {
		return iFrame;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Event getEvent() {
		return event;
	}

	public void setIFrame(String iFrameToAdd) {
		this.iFrame = iFrameToAdd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((event == null) ? 0 : event.hashCode());
		result = prime * result + ((genres == null) ? 0 : genres.hashCode());
		result = prime * result + ((iFrame == null) ? 0 : iFrame.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((speaker == null) ? 0 : speaker.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Talk other = (Talk) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (duration != other.duration)
			return false;
		if (event == null) {
			if (other.event != null)
				return false;
		} else if (!event.equals(other.event))
			return false;
		if (genres == null) {
			if (other.genres != null)
				return false;
		} else if (!genres.equals(other.genres))
			return false;
		if (iFrame == null) {
			if (other.iFrame != null)
				return false;
		} else if (!iFrame.equals(other.iFrame))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (speaker == null) {
			if (other.speaker != null)
				return false;
		} else if (!speaker.equals(other.speaker))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Talk [id=" + id + ", title=" + title + ", description=" + description + ", duration=" + duration
				+ ", speaker=" + speaker + ", genres=" + genres + ", tags=" + tags + ", iFrame=" + iFrame + ", event="
				+ event + "]";
	}
	
}
