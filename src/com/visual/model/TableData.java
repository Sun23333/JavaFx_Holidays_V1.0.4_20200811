package com.visual.model;

import javafx.beans.property.SimpleStringProperty;

/**
 * 	TableView�������ݽṹ
 * 
 * @author Sunny
 *
 */
public class TableData {
	// Ŀǰ������JavaFX�е�����һ�������Property,�������Է��������ط������ݰ�ʹ��
	private SimpleStringProperty eventIndex = new SimpleStringProperty();
	private SimpleStringProperty eventTime = new SimpleStringProperty();
	private SimpleStringProperty eventLoca = new SimpleStringProperty();
	private SimpleStringProperty eventPos = new SimpleStringProperty();
	private SimpleStringProperty energy = new SimpleStringProperty();
	private SimpleStringProperty grade = new SimpleStringProperty();
	/***
	 * 
	 * @param eventIndex �¼����
	 * @param eventTime  ����ʱ��
	 * @param eventLoca  ����̨վ
	 * @param eventPos   ��λ����
	 * @param energy     ����
	 * @param grade      ��
	 */
	public TableData(String eventIndex, String eventTime, String eventLoca, String eventPos, String energy,
			String grade) {
		super();
		this.eventIndex.set(eventIndex);
		this.eventTime.set(eventTime);
		this.eventLoca.set(eventLoca);
		this.eventPos.set(eventPos);
		this.energy.set(energy);
		this.grade.set(grade);
	}

	public String getEventIndex() {
		return eventIndex.get();
	}

	public void setEventIndex(String eventIndex) {
		this.eventIndex.set(eventIndex);
		;
	}

	public String getEventTime() {
		return eventTime.get();
	}

	public void setEventTime(String eventTime) {
		this.eventTime.set(eventTime);
		;
	}

	public String getEventLoca() {
		return eventLoca.get();
	}

	public void setEventLoca(String eventLoca) {
		this.eventLoca.set(eventLoca);
		;
	}

	public String getEventPos() {
		return eventPos.get();
	}

	public void setEventPos(String eventPos) {
		this.eventPos.set(eventPos);
		;
	}

	public String getEnergy() {
		return energy.get();
	}

	public void setEnergy(String energy) {
		this.energy.set(energy);
		;
	}

	public String getGrade() {
		return grade.get();
	}

	public void setGrade(String grade) {
		this.grade.set(grade);
		;
	}

}
