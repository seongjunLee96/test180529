package java_example_180521;

public class ch5_12_arrayExercise {

	public static void main(String[] args) {
		/*
		 * 2차원 배열을 사용하여 평점 계산하기
		 */
		double score[][] = {{3.3, 3.4}, {3.5, 3.8}, {4.2, 4.3}, {3.9, 4.0}};
		double sum = 0.0;
		int count = 0;
		for(int i = 0 ; i < score.length ; i++) {	//score.length  : score 배열의 행의 길이 = 4
			for(int j = 0 ; j < score[i].length; j++) {	//score[i].length : score 배열의 1행의 열의 길이 = 2
				sum += score[i][j];
				count++;
			}
		}
		System.out.println("전체 평균 : " + sum / count);
	}

}
