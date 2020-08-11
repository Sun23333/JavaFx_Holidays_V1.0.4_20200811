package com.visual.model;


/**
 * the constant and partial static variable used in this procedure.
 * @author Baishuo Han, Hanlin Zhang.
 */
public class Parameters
{
	/**��ʱ����ʱ������λ�Ǻ���*/
	public static final int LONGTIMEWINDOW = 50;// ��λ�Ǻ���
	/**��ʱ����ʱ������λ�Ǻ���*/
	public static final int SHORTTIMEWINDOW = 10;// ��λ�Ǻ���
	/**
	 * �������Ĳ���Ƶ�ʣ���λ��hz/s���ĵ�����10k����ʾÿ����10000������
	 */
	public static final int FREQUENCY = 4800;// ��λhz/s
	public static double distanceToSquareWave = 0.2;//����ʱ���Ƿ��Ƿ����ɵ͵�ƽ���ߵ�ƽ��λ�ã�����������ʦ�����������뷽���ɵ͵��ߵ�ƽ��������д���λ�ã����統ǰ�����뷽�����0.3s��ñ���ֵΪ0.3.
	/**
	 * ���ڵ�λת��������Ƶ�����룬����ʱ���ĵ�λ�Ǻ���
	 */
	private static final int TEMP = 1000;// ��λת��
	/**
	 * ����ͨ��ת����ʹ�õ���ֵ��HEAD��ʾͨ������������
	 */
	public static final int HEAD = 32767;
	public static final int TAIL = -32768;
	
	/**
	 * �洢�鴰�ڵ����ݣ��鴰�ڱ�����һ��10�������еĺ�5�����ݣ��������������ǰ�ߵ�����
	 */
//	public static final int COUNT5sRECORD = 5 * FREQUENCY;
	/**
	 * ��ʱ�����������
	 */
	public static final int N1 = LONGTIMEWINDOW * (FREQUENCY+200) / TEMP;
	/**
	 * ��ʱ�����������
	 */
	public static final int N2 = SHORTTIMEWINDOW * (FREQUENCY+200) / TEMP;
	/**
	 * (һ����ʱ��+һ����ʱ��)ʱ���������ܸ���
	 */
	public static final int N = (LONGTIMEWINDOW + SHORTTIMEWINDOW) * (FREQUENCY+200) / TEMP;
	/**
	 * ��ʱ��ƽ��ֵ�볤ʱ��ƽ��ֵ�ı�ֵ����2.5���ϴν���
	 */
	public static double ShortCompareLong = 2;
	public static double ShortCompareLongAdjust=1.4;

	public static int afterRange = (Parameters.FREQUENCY+200)/10;
	public static int refineRange = (Parameters.FREQUENCY+200);
//	public static final double afterRange_Threshold123 = 1000;
	public static double afterRange_Threshold456 = 1000;
	public static double refineRange_Threshold456 = 2000;
	
	/**
	 * ���������������Ĵ��仨��ʱ�䣬����1s����Ϊ��ʱͬʱ�������¼�����Ҫ����ʵ�ʵ�֮��ľ���Ͳ��ٽ��е�����
	 */
	public static int IntervalToOtherSensors=5;
	/**
	 * when it is true, then the time interval among all sensors are turn on.
	 */
	public static boolean SSIntervalToOtherSensors=true;
	/**
	 * 10s��ʱ���ĸ�������Ϊÿ�μ�������ݶ���10���ڵ����ݣ�Ŀǰ��������ʱ�������Ѿ��ò�����
	 */
	public static final int WINDOWNUMBER = 166;
	/**
	 * ����ʱ��ÿ���ƶ��ľ��루�������ڵ�����������ʱ����Ϊ�ƶ�100������
	 * ��ֵ����̫С����������ڵ������ܲ��У�����ʵʱ��ȡ��������
	 */
	public static int INTERVAL = 50;
	/**
	 * P�����٣�ֻ��ͨ������׼ȷ�ⶨ������ֻ�ܹ��㣬���ڶ�λ���Ӱ��ϴ�
	 */
	public static int C = 3850;
	/**
	 * S�����٣�ͨ��P�����ټ��㣬��̨վ��λʹ�ã��Զ�λ���Ӱ��ϴ�
	 */
	public static final double S=C/Math.sqrt(3);
	/**
	 * ���ô�������������ͨ���趨�������е�fileStr����
	 */
//	public static final int SensorNum =0;
	/**
	 * ��0-5����Ϊ�����̷��ı����������������������ڴ��������õ������̶��󣬲���ͨ����ʱ��۲�ȷ��
	 * ���˳�����������ʱ�Ĵ��������˳��һ��
	 */
	public static final double backGround[] ={29.0,17.0,12.5,5.6,0};
	public static final double backGroundVariance[] = {};
	/**
	 * ������д����������������Ϣ����Ҫ�о���γ�Ⱥ���
	 * ����������Ϣ ���ȣ�ά�ȣ����Σ�����ΪCAD��λ�����ڳ�������ǰ����
	 */
	public static final double[][] SENSORINFO = {
			{ 41518099.807,4595388.504,22.776 },//T
			{ 41518060.298,4594304.927,21.926  },//U
			{ 41520207.356,4597983.404,22.661  },//W
			{ 41520815.875,4597384.576,25.468  },//X
			{ 41519304.125,4595913.485,23.921  },//Z
			{ 41519926.476,4597275.978,20.705  },//Y
			{ 41516707.440,4593163.619,22.564  },//V
			{ 41516836.655,4596627.472,21.545  },//S
			{ 41516849.629,4598099.366,21.071  }//R
	};//������Ϊţ�Ҵ塢ϴú������ɽ�����Ҵ塢ʮһ��ҵ�㳡�ϰ칫¥���Ͻǻ�̳�����羮�����깤��
	public static final String region = "����";
	/**
	 * ͨ�����������ֽ����ã��ھ��豸��ʹ��
	 */
	public static int WenJianTou = 284;//4ͨ������242��7ͨ������284,this variable is changed by ReadData class and 
	
	public static int ShuJuTou1=10;//�µ��豸ֻ��10���ֽڵ�ͷ���������������ݡ�
	public static int ShuJu=210;//����ռ210���ֽڡ�
	public static int Shi=10;//ÿ�ζ�10���ֽڡ�
	
	public static int Yizhen = 220;//���豸һ֡��220���ֽ�����ǰ10���ֽ���ͷ��
	public static int YIMiaoG=15720;//һ��һ����15720���ֽ�,������ÿ֡��10���ֽ�ͷ
	public static int YIMiao=15000;//һ������ݹ���15000���ֽ�
	public static int San=3;//3���ֽڽ�����ʾ

	/**
	 * The during time we set to cut the data from 30s data.
	 */
	public static int startTime = 3;//��ʼ�Ľ�ȡʱ�䣬����λ��ǰ��5s
	public static int endTime = 15;//�����Ľ�ȡʱ�䣬����λ�ú���10s
	/**
	 * ͨ����Ϊ123ʱ��ʹ��123ͨ��
	 * ͨ����Ϊ456ʱ��ʹ��456ͨ��
	 * ͨ����Ϊ123456ʱ��ʹ��123456ͨ��
	 */
//	public static final int TongDao=123456;
	public static int TongDaoDiagnose=0;//If there has only one sensor's channel numbers are 4, this variable becomes 0.
	public static int motivationDiagnose=1;//���Ͼ�ϸ�жϡ�
	/**
	 * ��ʼ���̷���Ϣ�����ڳ���ʱ�����жϡ������������ݵı��棬����Mainthread�е�fileStr������ͬ
	 * �����봫����������ͬ���Ҹñ���������ÿ�β����µص��ֱ���޸ģ������޷����г��򣡣�����
	 */
	public static String[] diskName = { "t:/" , "u:/" , "w:/" , "x:/" , "z:/" , "y:/" , "v:/" , "s:/" , "r:/"};
	/**
	 * when we will store data to txt file, we need to set this variable to 1.
	 */
	public static final int isStorageToTxt = 0;
	/**
	 * when we will store one minute long data, we need to set this variable to 1.
	 */
	public static int isStorageOneMinuteData = 0;
	/**
	 * when we will store data to database, we need to set this variable to 1.
	 */
	public static int isStorageDatabase = 1;
	/**
	 * when we will store each motivation sensor data to csv file, we need to set this variable to 1.
	 */
	public static int isStorageEachMotivationCSV = 0;
	/**
	 * when we will store all motivation sensor data to csv file, we need to set this variable to 1.
	 */
	public static int isStorageAllMotivationCSV = 1;
	/**
	 * when we will store record of each event, we need to set this variable to 1.
	 */
	public static int isStorageEventRecord = 1;
	/**
	 * ������̨վ����̨վtxt�洢·��
	 * Ĭ��Ϊ��D://ConstructionData//3moti//
	 */
	public static String AbsolutePath3 = "D:/data/ConstructionData/3moti/";
	public static String AbsolutePath5 = "D:/data/ConstructionData/5moti/";
	/**
	 * the record position.
	 */
//	public static final String AbsolutePath3_record = "D:/data/";
	public static String AbsolutePath5_record = "D:/data/ConstructionData/";

	public static String AbsolutePath_CSV3 = "D:/data/ConstructionData/3moti/";
	public static String AbsolutePath_CSV5 = "D:/data/ConstructionData/5moti/";
	public static String AbsolutePath_allMotiTime_record = "D:/data/ConstructionData/TimeRecords.csv";
	/**
	 * 1���ӵ����ݴ��λ��
	 */
	public static final String AbsolutePathMinute = "D:/data/ConstructionData/oneMinutedata/";
	/**
	 * 5̨վ��3̨վ��������ݿ����
	 */
	public static final String DatabaseName5 = "mine_quack_5_results";
	public static final String DatabaseName5_updated = "mine_quack_5_results_updated";
	public static final String DatabaseName4 = "mine_quack_4_results";
	public static final String DatabaseName3 = "mine_quack_3_results";
	public static final String DatabaseName3_updated = "mine_quack_3_results_updated";
	/**
	 * �����ظ��������������ظ��̷�ʱ���ñ��������á�
	 * @description
	 * �ñ������̷�������ͬ����ͬ���̷�������x��x��x��y��y�����ʱ�̷�����Ϊ2
	 * @description
	 * ����Ԥ����9����������λ�ã���initPanfu����һ��Ҫ����diskName����ĳ��ȣ�������ܻ����
	 * @description
	 * ÿ��Ԫ��Ϊ0ʱ����ʾ��ǰ��������Ӧ���̷�û�д洢���ļ����洢���󣬽���Ӧ��λ��Ԫ����1
	 * @description
	 * �����ٳ��ָ��̷�ʱ�������ٴδ洢һ�Σ���ɴ��̿ռ���˷Ѻ����ݵ����࣬���º��ڴ������ݵ��鷳
	 */
	public static final int [] initPanfu = {0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0};
	/**
	 * trueΪ����״̬����������������û�м�����ʱ�����ڲ������ݿ�����ع��ܵ���ȷ�Ժ�bug
	 * falseΪ��������״̬�����в��������յ���ʵ�ʲ�������
	 */
	public static boolean Adjust=false;
	/**
	 * true indicate we will minus a fixed value on the magnitude.
	 * false indicate we will not minus a fixed value on the magnitude.
	 */
	public static boolean MinusAFixedOnMagtitude = true;
	public static double MinusAFixedValue = 2.8;
	/**
	 * if adjust the procedure to read the second new file endwith hfmed
	 * please turn this variable to true.
	 */
	public static boolean readSecond=false;
	/**
	 * plus times
	 */
	public static double plusSingle_coefficient = 0.00001562;
	public static double plusDouble_coefficient_45 = 0.00000298;
	public static double plusDouble_coefficient_12 = 0.00004768;
	
	/**
	 * control to run procedure in a offline way.
	 */
	public static boolean offline=true;
	
	/**where the data are reading from?
	 * There are two regions we distribute called datong, pingdingshan.
	 * */
	private static String [] station= {"hongyang","datong","pingdingshan"};
	public static final String region_offline =station[0];
	/**
	 * the time to read when procedure start.
	 */
//	public static final String timeStr = "170214123000";
	public static final String timeStr = "200214130000";
	/**the data file must store in a fold which name ends with "1" or "2" or "3" or "4" and etc.
	 * Please modify this variable to adapt different mining area.
	 * */
	public static final String[] diskName_offline = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	
	/**the location of all sensor which must be correspond with diskName_offline in sequence.*/
	public static final double[][] SENSORINFO_offline_datong = {
//		 { 1987, 2567, 1560.4 }, //   1��S  Test1
//         { 2291, 2618, 1546 },   //   2��U  Test2
//         { 1689, 2383, 1561.2 }, //   3��V  Test3
//         { 2016, 3034, 1563.8 }, //   4��W  Test4
//         { 928, 2763, 1544 },   //   5��X  Test5
//         { 1940, 2400, 1562 },   //   6��Y  Test6
//         { 1587, 2614, 1554.8 }, //   7��Z  Test7
	         
		{ 541689, 4422383, 1561.2 },//3��V we also need to confirm the coordination of datong for the sensors removing from the original position.
		{ 542016, 4423034, 1563.8 },//4��W
		{ 540928, 4422763, 1544 },//5��X
		{ 541940, 4422400, 1562 },//6��Y
		{ 541587, 4422614, 1554.8 },//7��Z
		{ 542291, 4422618, 1546 },//2��U
		{ 541987, 4422567, 1560.4 },//1��T
	};//������Ϊţ�Ҵ塢ϴú������ɽ�����Ҵ塢ʮһ��ҵ�㳡�ϰ칫¥���Ͻǻ�̳�����羮�����깤��
	public static final double[][] SENSORINFO_offline_hongyang = {
			{ 41516836.655,4596627.472,21.545  },//S Test1
			{ 41518099.807,4595388.504,22.776 },//T Test2
			{ 41518060.298,4594304.927,21.926  },//U Test3
			{ 41520207.356,4597983.404,22.661  },//W Test4
			{ 41520815.875,4597384.576,25.468  },//X Test5
			{ 41519926.476,4597275.978,20.705  },//Y Test6
			{ 41519304.125,4595913.485,23.921  },//Z Test7
			{ 41516707.440,4593163.619,22.564  },//V Test8
			{ 41516849.629,4598099.366,21.071  }//R Test9
	};
	
	public static final double[][] SENSORINFO_offline_pingdingshan = {
			{ 3744774.016, 38422332.101, 157.019 },//T Test1 ţ�Ҵ�
			{ 3743774.578, 38421827.120, 120.191 },//U Test2 ϴú��
			{ 3744698.415, 38421314.653, 126.809 },//W Test3 ��ɽ��
			{ 3744199.610, 38423376.100, 202.175 },//V Test4 ���Ҵ�
			{ 3742996.232, 38423392.741, 117.530 },//Z Test5 ��ҵ�㳡
			{ 3746036.362, 38419962.476, 127.009 },//Y Test6 ���羮
			{ 3743713.362, 38423292.665, 139.238 }//X Test7 ���깤��
	};
	
	public static final double[][] SENSORINFO_offline_shuangyashan = {
			{ 44442821, 5181516, 89.0 },//the disk name is not clear.
			{ 44440849, 5181084, 115.8 },
			{ 44443148, 5178624, 110.2 },
			{ 44441763, 5179060, 104.4 },
			{ 44442327, 5180765, 93.3 }
	};//������Ϊ���羮����ҩ�⡢�����塢ˮ������ҵ�㳡
	
	/**motiData storage path, you can modify this path to adapt to your need.
	 * Then, we need to create several folds as the same as the length of diskName_offline
	 * such as "Text1","Text2","Text3","Text4", and et al.
	 * */
	public static final String AbsolutePath3_offline = "D:/data/ConstructionData/3moti/";
	public static final String AbsolutePath5_offline = "D:/data/ConstructionData/5moti/";
	public static final String AbsolutePath_CSV3_offline = "D:/data/ConstructionData/3moti/";
	public static final String AbsolutePath_CSV5_offline = "D:/data/ConstructionData/5moti/";
	
	/**
	 * ����ע����Ҫ����ǰ�꣬�Է�ֹ�����޷��жϳ���λ��
	 * �������򣺸�������ʾ��_�Բ������ƣ�����㲿�ֵĽ����𼶱�ʾΪ��compute_nearQuake
	 * ���Բ��ֵ���ʾ����
	 * ���㲿�֣�compute
	 * 	 �����𼶣�nearQuake
	 *     ������energy
	 *   ����ʱ���𼶣�duiringQuake
	 *   ���㶨λ��threeLocation
	 *   ��㶨λ��fiveLocation
	 *   ���¼���λ��mainLocation
	 *   
	 * �����֣�read
	 *  ���룺readDatadui
	 *  ��1s��readData
	 *  
	 * �νӲ��֣������򲿷֣���main
	 *  �������󲽣�
	 *    ���������ļ���find
	 *    ���룺duiqi
	 * 
	 * ���ݿ�洢���֣�DB
	 *  д�룺write
	 *  ��ѯ��select
	 *  
	 * ǰ��̨�������֣�sev
	 *  ��ѯ��select
	 *  ���䣺translate1~translateN
	 *  
	 */
	public static final String compute_nearQuake = "compute_nearQuake";
	public static final String compute_energy = "compute_energy";
	public static final String compute_duiringQuake = "compute_duiringQuake";
	public static final String compute_threeLocation = "compute_threeLocation";
	public static final String compute_fiveLocation = "compute_fiveLocation";
	public static final String compute_mainLocation = "compute_mainLocation";
	
	public static final String read_readDatadui = "read_readDatadui";
	public static final String read_readData = "read_readData";
	
	public static final String main_find = "main_find";
	public static final String main_duiqi = "main_duiqi";
	
	public static final String DB_write = "DB_write";
	public static final String DB_select = "DB_select";
	
	public static final String sev_select = "sev_select";
	public static final String sev_translate1 = "sev_translate1";
	public static final String sev_translate2 = "sev_translate2";
	public static final String sev_translate3 = "sev_translate3";
	public static final String sev_translate4 = "sev_translate4";
	public static final String sev_translate5 = "sev_translate5";

}
