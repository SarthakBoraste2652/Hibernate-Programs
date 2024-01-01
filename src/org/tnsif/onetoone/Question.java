package org.tnsif.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private int qId;
	private String question;
	
	@OneToOne
	@JoinColumn(name="answer")
	private Answer ans;

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Question [qId=" + qId + ", question=" + question + ", ans=" + ans.getAnsId() + " "+ans.getAnswer()+"]";
	}
	
	
}
