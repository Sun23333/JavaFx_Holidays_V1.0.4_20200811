package com.visual.view;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.visual.model.TableData;
import com.visual.util.Tools_DataCommunication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class UIController {

//--------------------------CAD����--------------------------
	@FXML
	private AnchorPane mGreenPane;
	@FXML
	private BorderPane mBorderPane;
//--------------------------���-------------------
	@FXML
	private AnchorPane mYellowPane;
	@FXML
	private TableView<TableData> mTableView;
	@FXML
	private TableColumn<TableData, String> eventIndex;// �����¼����
	@FXML
	private TableColumn<TableData, String> eventTime;// ����ʱ��
	@FXML
	private TableColumn<TableData, String> eventLoca;// ����̨վ
	@FXML
	private TableColumn<TableData, String> eventPos;// ��λ����
	@FXML
	private TableColumn<TableData, String> energy;// ����
	@FXML
	private TableColumn<TableData, String> grade;// ��
//--------------------------����ͼ-------------------
	@FXML
	private AnchorPane mBluePane;
	@FXML
	private LineChart<Number, Number> mChart_T1;
	@FXML
	private LineChart<Number, Number> mChart_T2;
	@FXML
	private LineChart<Number, Number> mChart_T3;
	@FXML
	private LineChart<Number, Number> mChart_T4;
	@FXML
	private LineChart<Number, Number> mChart_T5;
	@FXML
	private LineChart<Number, Number> mChart_T6;
	@FXML
	private LineChart<Number, Number> mChart_T7;
	@FXML
	private LineChart<Number, Number> mChart_T8;
	@FXML
	private LineChart<Number, Number> mChart_T9;

//------------------------------------------------------------------
//--------------------------��ť�󶨵��¼�--------------------------
//------------------------------------------------------------------
	@FXML
	void onOperationButtonClick(ActionEvent event) {
		System.out.println("�û���������ToggleButton��ť");
	}

	@FXML
	void onDayScheduleClick(ActionEvent event) {
		System.out.println("�û������ձ���ToggleButton��ť");
	}

	@FXML
	void onMonthScheduleClick(ActionEvent event) {
		System.out.println("�û������±���ToggleButton��ť");
	}

	@FXML
	void onHelpClick(ActionEvent event) {
		System.out.println("�û����°���ToggleButton��ť");
	}

	@FXML
	void onZoomIN(ActionEvent event) {
		System.out.println("�Ŵ�");
	}

	@FXML
	void onZoomOut(ActionEvent event) {
		System.out.println("��С");
	}

	@FXML
	void onRestore(ActionEvent event) {
		System.out.println("��ԭ");
	}

	// ��Main�������fxml�ļ�ʱ��ִ��
	@FXML
	void initialize() {
		Tools_DataCommunication.getCommunication().showCAD(mBorderPane);// ��ʾCAD
		// ��TableColumn��TableDataÿһ��������������
		Tools_DataCommunication.getCommunication().InitTableViewData(eventIndex, eventTime, eventLoca, eventPos, energy,
				grade);
		Tools_DataCommunication.getCommunication().ShowTableView(mTableView);// ��ʾTableView
		Tools_DataCommunication.getCommunication().ShowLineChart(mChart_T1, mChart_T2, mChart_T3, mChart_T4, mChart_T5,
				mChart_T6, mChart_T7, mChart_T8, mChart_T9);//��ʾ����ͼ
		System.out.println("�ѳ�ʼ����UI������");
	}
}
