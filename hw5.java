import java.io.*;
import java.math.BigDecimal;

public class hw5 {
	
	BufferedReader buf;	
	int adult , child , people , date , free , money;
	float price;
	public hw5() throws IOException{
		// TODO Auto-generated constructor stub
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���餤�Ƚп�J0�A����ߤW�άO�Ұ���п�J1");
		String num = buf.readLine();
		int time = Integer.parseInt(num);
		System.out.println("�п�J�j�H�ƶq");
		String num1 = buf.readLine();
		int big = Integer.parseInt(num1);
		System.out.println("�п�J�p�ļƶq");
		String num2 = buf.readLine();
		int small = Integer.parseInt(num2);
		people = big + small;
		if(time == 0){
			adult = 268;
			child = 120;
		}
		else if(time == 1){
			adult = 368;
			child = 150;
		}
		if(people < 3){
			price = adult * big + child * small;
			price = price * 1.1f;
			float finalprice = new BigDecimal(price).setScale(0, BigDecimal.ROUND_HALF_UP).floatValue();
			price = finalprice;
		}
		else if(people >= 3 && people < 10){
			free = people / 3;
			if(small > 0 && small >= free){
				price = adult * big + child * (small - free);
				price = price * 1.1f;
				float finalprice = new BigDecimal(price).setScale(0, BigDecimal.ROUND_HALF_UP).floatValue();
				price = finalprice;
			}
			else if(small > 0 && small < free){
				price = adult * (big - (free - small)) + child * (free - small);
				price = price * 1.1f;
				float finalprice = new BigDecimal(price).setScale(0, BigDecimal.ROUND_HALF_UP).floatValue();
				price = finalprice;
			}
		}
		else if(people >= 10){
			free = people / 3;
			if(small > 0 && small >= free){
				price = adult * big + child * (small - free);
				price = price * 0.95f;
				price = price * 1.1f;
				float finalprice = new BigDecimal(price).setScale(0, BigDecimal.ROUND_HALF_UP).floatValue();
				price = finalprice;
			}
			else if(small > 0 && small < free){
				price = adult * (big - (free - small));
				price = price * 0.95f;
				price = price * 1.1f;
				float finalprice = new BigDecimal(price).setScale(0, BigDecimal.ROUND_HALF_UP).floatValue();
				price = finalprice;
			}
		}
		System.out.println("�������O�@�@" + people + "�H �j�H" + big + "�� �p��" + small + "��" + " �@�@" + free + "�H�K�O");
		System.out.println("�`���B" + Math.round(price));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new hw5();
	}

}
