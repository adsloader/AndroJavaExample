package 순수자바트레이닝.여섯째날_동기비동기.기차시스템2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by snake on 16. 8. 25.
 */
public class KTX열차 {

    // 필요한 것들. 정착역, 손님리스트, 현재 정착역 위치
    String [] Stations = {"서울역", "천안", "대전", "대구", "부산"};
    ArrayList<여행객> customer = new ArrayList <여행객>();
    int nCurrent = 0;

    // 여행객이 승차한다.
    public void passenger_in_train(여행객 person){
        String sNowStation = Stations[nCurrent];
        if (!person.destination.equals(sNowStation)){
            person.start = sNowStation;
            person.take_train();
            customer.add(person);

        }

    }

    // 여행객이 하차한다.
    void passenger_out_train(){

        for(int i =0; i< customer.size(); i++){
            여행객 p = customer.get(i);
            String sNowStation = Stations[nCurrent];
            if(p.destination.equals(sNowStation)){
                p.leave_train();

            }
        }
    }

    // 다음역으로 이동 <- 비동기적으로 구현
    public void On다음역도착할때(){

        // 종착역이 아닐경우
        if (nCurrent < Stations.length){
            passenger_out_train();

        }

        // 종착역일 경우
        if(nCurrent == Stations.length -1){
            customer.removeAll(customer);
            System.out.println("종착역입니다.");

            customer.removeAll(customer);

        }

        String sNowStation = Stations[nCurrent];
        System.out.println("현재역은--->" + sNowStation);
        System.out.println("-------------------------");

        // 도착했으니 그리고 내렸으니 승차를 한다.
        승객을승차시켜라();

        // 다음역으로 위치를 +1
        nCurrent++;
    }

    // 승객을 승차시켜라...
    private void 승객을승차시켜라() {
        do{
            String 현재역 = Stations[nCurrent];
            System.out.println("행선지>");
            for (int i = 0; i < Stations.length; i++){
                System.out.print(Stations[i] + " : ");
            }
            System.out.println("\n____________________________________");
            System.out.println(현재역 + "에 도착했습니다. 승객을 태웁니다\n입력없이 엔터를 누르면 출발합니다.");

            Scanner sc = new Scanner(System.in);
            System.out.println("승객의이름:");
            String name = sc.nextLine();
            System.out.println("행선지:");
            String dest = sc.nextLine();

            if(name.length() < 1) break;
            passenger_in_train(new 여행객(name, dest));

        } while (true);
    }
}