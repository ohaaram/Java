package sub1;

public class Test04 {
	public static void main(String[] args) {
		String fileName="HelloWorld.java";
		
		int idx=fileName.indexOf(".");
		
		String title=fileName.substring(0,idx);
		String ext=fileName.substring(idx+1);
		
		System.out.println("파일명 : "+title);
		System.out.println("확장자 : "+ext);
		
		String strScores="60,72,82,86,92";
		String[] scores =strScores.split(",");
		
		int total=0;
		
		for(String score:scores) {
			total+=Integer.parseInt(score.trim());//공백을 없애주는 trim()
			//지금 모든 숫자의 앞에는 공백이 존재하기 때문에 trim을 써줘야한다.
		}
		System.out.println("strScores 총점 : "+total);
	}

}
