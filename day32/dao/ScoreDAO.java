package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import dto.StudentVO;

public class ScoreDAO {
	//������
	public final int SUBJECT_SIZE = 3;
	public Scanner sc = new Scanner(System.in);
	private ArrayList<StudentVO> arStudent = null;
	private ArrayList<Integer> arScore = null;
	private HashMap<StudentVO, ArrayList<Integer>> smsMap = new HashMap<>();
	
	public void index() {
		//���� view��
		int choice = 0;
			do {
				System.out.println("�л� ���� �ý���");
				System.out.println("1. ���");
				System.out.println("2. �˻�");
				System.out.println("3. ������");
				choice = sc.nextInt();
				sc.nextLine();
				if (choice == 3) break;
				
				switch(choice) {
				case 1:
					join();
					break;
				case 2:
					search();
					break;
				default:
					System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				}
			} while (true);
	}
	
	public void join() {
		String isQuit = "";
		do {
			System.out.println("======[�л����� �Է�(����� q)]======");
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			int age = sc.nextInt();
			
			//���� �Է� �� ���� ���
			sc.nextLine();
			StudentVO std = new StudentVO(name, age);
			arStudent = new ArrayList<>();
			arScore = new ArrayList<>();
			
			arStudent.add(std);
			System.out.println("���� ���� ���� ������ �Է��ϼ���\n100 90 20");
			for (int i = 0; i < SUBJECT_SIZE; i++) {
				arScore.add(Integer.parseInt(sc.next()));
			}
			smsMap.put(std, arScore);
			System.out.println("����?");
			
			//���� �Է� �� ���� ���
			sc.nextLine();
			isQuit = sc.nextLine();
			System.out.println(smsMap);
		}while(isQuit.intern() != "q");
		list(smsMap);
	}
	
	public void list(HashMap<StudentVO, ArrayList<Integer>> db) {
		System.out.println("======[���� ���]======");
		
		Set<Entry<StudentVO, ArrayList<Integer>>> set = db.entrySet();
		Iterator<Map.Entry<StudentVO, ArrayList<Integer>>> iter = set.iterator();
		
		while(iter.hasNext()) {
			Entry<StudentVO, ArrayList<Integer>> temp = iter.next();
			temp.getKey().show();
			for(int score : temp.getValue()) {
				System.out.print(score+"��   ");
			}
			System.out.println("\n");
		}
	}
	
	public void search() {
		Set<StudentVO> scoreSet = smsMap.keySet();
		Iterator<StudentVO> iter = scoreSet.iterator();
		
		String name = null;
		System.out.println("�˻��� �л��� �̸� : ");
		name = sc.nextLine();
		
		System.out.println("=====[�˻� ���]=====");
		while(iter.hasNext()) {
			StudentVO std = iter.next();
			if(name.equals(std.getName())) {
				std.show();
				System.out.println("      ����     ����     ����");
				System.out.print("    ");
				for(int score : smsMap.get(std)) {
					System.out.print(score+"��   ");
				}
				System.out.println("\n");
			}
		}
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
	
}



