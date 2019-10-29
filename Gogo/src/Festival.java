import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Festival {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int c = Integer.parseInt(bf.readLine()); 
		
		for (int j = 0; j < c; j++) {
			String [] scan = bf.readLine().split(" ");	
			int n = Integer.parseInt(scan[0]);
			int l = Integer.parseInt(scan[1]);
			scan = bf.readLine().split(" ");
			int	[] lCost = new int [1001];
			for (int i = 0; i < n; i++) {
				lCost [i] = Integer.parseInt(scan[i]);
			}
			//System.out.println("lCost :"+lCost.length+" l :"+l);	
			double min = 100;
			for (int k = 0; k < n; k++) {
				int		step = 0;	//
				double  total = 0;	//값
				
				for (int i = k; i < n; i++) {
					step ++;
					total += lCost[i];
//					System.out.println("k :"+k+" i :"+i+" lCost[] :"+lCost[i]+" total :"+total+" total/step :"+total/step);
					if (step >= l && min > total/step) {
						min = total/step;
					}
				}
			}
			System.out.printf("%.10f\n", min);
		}
	}
}
//입력의 첫 줄에는 테스트 케이스의 수 c (c ≤ 100)가 주어집니다.
//각 테스트 케이스의 첫 줄에는 공연장을 대여할 수 있는 날들의 수 N (1 ≤ N ≤ 1000)과 
//이미 섭외한 공연 팀의 수 l (1 ≤ l ≤ 1000, l ≤ N)이 주어집니다. 그 다음 줄에는
//N개의 숫자로 공연장 대여 비용이 날짜별로 주어집니다. 모든 비용은 100 이하의 자연수입니다.

//2 
//6공연장 대여날 3섭외팀
//1 2 3 1 2 3 
//6 2 
//1 2 3 1 2 3
//예제 출력
//1.75000000000
//1.50000000000
// 전체 공연일수중 최소 참여 팀만큼은 빌려야함 