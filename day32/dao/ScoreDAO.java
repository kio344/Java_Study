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
	//국영수
	public final int SUBJECT_SIZE = 3;
	public Scanner sc = new Scanner(System.in);
	private ArrayList<StudentVO> arStudent = null;
	private ArrayList<Integer> arScore = null;
	private HashMap<StudentVO, ArrayList<Integer>> smsMap = new HashMap<>();
	
	public void index() {
		//메인 view단
		int choice = 0;
			do {
				System.out.println("학생 관리 시스템");
				System.out.println("1. 등록");
				System.out.println("2. 검색");
				System.out.println("3. 나가기");
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
					System.out.println("잘못 입력 하셨습니다.");
				}
			} while (true);
	}
	
	public void join() {
		String isQuit = "";
		do {
			System.out.println("======[학생정보 입력(종료는 q)]======");
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			//나이 입력 후 엔터 상쇄
			sc.nextLine();
			StudentVO std = new StudentVO(name, age);
			arStudent = new ArrayList<>();
			arScore = new ArrayList<>();
			
			arStudent.add(std);
			System.out.println("국어 영어 수학 점수를 입력하세요\n100 90 20");
			for (int i = 0; i < SUBJECT_SIZE; i++) {
				arScore.add(Integer.parseInt(sc.next()));
			}
			smsMap.put(std, arScore);
			System.out.println("종료?");
			
			//점수 입력 후 엔터 상쇄
			sc.nextLine();
			isQuit = sc.nextLine();
			System.out.println(smsMap);
		}while(isQuit.intern() != "q");
		list(smsMap);
	}
	
	public void list(HashMap<StudentVO, ArrayList<Integer>> db) {
		System.out.println("======[가입 목록]======");
		
		Set<Entry<StudentVO, ArrayList<Integer>>> set = db.entrySet();
		Iterator<Map.Entry<StudentVO, ArrayList<Integer>>> iter = set.iterator();
		
		while(iter.hasNext()) {
			Entry<StudentVO, ArrayList<Integer>> temp = iter.next();
			temp.getKey().show();
			for(int score : temp.getValue()) {
				System.out.print(score+"점   ");
			}
			System.out.println("\n");
		}
	}
	
	public void search() {
		Set<StudentVO> scoreSet = smsMap.keySet();
		Iterator<StudentVO> iter = scoreSet.iterator();
		
		String name = null;
		System.out.println("검색할 학생의 이름 : ");
		name = sc.nextLine();
		
		System.out.println("=====[검색 결과]=====");
		while(iter.hasNext()) {
			StudentVO std = iter.next();
			if(name.equals(std.getName())) {
				std.show();
				System.out.println("      국어     영어     수학");
				System.out.print("    ");
				for(int score : smsMap.get(std)) {
					System.out.print(score+"점   ");
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



