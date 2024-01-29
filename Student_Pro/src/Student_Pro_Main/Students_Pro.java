package Student_Pro_Main;

import java.util.Scanner;

import DAO.DepartmentsDAO;
import DAO.LecturesDAO;
import DAO.ProfessorsDAO;
import DAO.RegisterDAO;
import DAO.StudentsDAO;
import DTO.StudentsDTO;

public class Students_Pro {
	public static void main(String[] args) {
		DepartmentsDAO depDAO = DepartmentsDAO.getInstance();
		LecturesDAO lecDAO = LecturesDAO.getInstance();
		ProfessorsDAO proDAO = ProfessorsDAO.getInstance();
		RegisterDAO regDAO = RegisterDAO.getInstance();
		StudentsDAO stdDAO = StudentsDAO.getInstance();
		StudentsDTO login = null;

		while (true) {

			Scanner sc = new Scanner(System.in);

			System.out.println("학사정보 프로그램입니다.");
			System.out.println("1. 로그인 |2. 회원가입 |3.프로그램종료");

			int choose = sc.nextInt();

			if (choose == 1) {
				System.out.println("아이디와 비밀번호를 입력해주세요");

				System.out.print("아이디 : ");
				String id = sc.next();

				System.out.print("비밀번호 : ");
				String pass = sc.next();
				login = stdDAO.selectStd(id, pass);

				if (login != null) {
					System.out.println(login.getStdname() + "님 환영합니다.");
				} else {
					System.out.println("아이디 및 비밀번호가 틀립니다.");
				}
			} else if (choose == 2) {
				// 회원가입하기(학생과 교수 나누어서 가입하기)

				StudentsDTO stdDTO = new StudentsDTO();

				System.out.println("1.학생 가입|2.교수 가입");
				System.out.print("선택 : ");
				choose = sc.nextInt();
				if (choose == 1) {
					// 학생 가입
					System.out.print("아이디 : ");
					String id=sc.next();
					stdDTO.setStdno(id);
					System.out.print("비밀번호 : ");
					stdDTO.setStdpass(sc.next());
					System.out.print("학과번호 : ");
					stdDTO.setDepno(sc.nextInt());
					System.out.print("담당교수번호 : ");
					stdDTO.setProno(sc.next());
					System.out.print("이름 : ");
					stdDTO.setStdname(sc.next());
					System.out.print("주민번호 : ");
					stdDTO.setStdjumin(sc.next());
					System.out.print("연락처 : ");
					stdDTO.setStdhp(sc.next());
					System.out.print("이메일 : ");
					stdDTO.setStdemail(sc.next());					
					System.out.print("주소:");
					sc.nextLine();
					stdDTO.setStdaddr(sc.nextLine());
					

					stdDAO.insertStd(stdDTO);
					
					if(id.equals(stdDTO.getStdno())){
					System.out.println("중복아이디 입니다. 다시 시도해주세요");
					}
					else{
						System.out.println("가입이 완료되었습니다.");
					}

				} else {
					// 교수 가입

				}
			} else if (choose == 3) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}else {
				System.out.println("다시 입력해주세요:");
			}

		}
	}

}
