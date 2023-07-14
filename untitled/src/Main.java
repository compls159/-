import java.util.*;



public class Main extends Customer {
    public static User_Tier type;
    public static  int final_price;
    public Main(String way, String name, String tier, String how, int money) {
        super(way, name, tier, how, money);
    }

    public static void main(String[] args) {
        //세일 서비스 객체 생성
        //고객 객체 생성
        Customer customer1 = new Main("Web", "이름6", String.valueOf(type.GOLD), "할인 결제 방식", 10000);
        Customer customer2 = new Main("Mobile","이름7",String.valueOf(type.BRONZE),"보너스 결제 방식",10000);
        //고객 리스트 생성, 추가
        Map<Customer, Customer> customers = new HashMap<>();
        customers.put(customer1,customer1);
        customers.put(customer2,customer2);
        //고객 정보 조회 & 가격 계산
        int change_price;
        String how = customer1.getHow();
        Customer c;
        customers.get(customer1).user_calculation(how,customers.get(customer1).tier,customers.get(customer1).money);

        how = customer2.getHow();
        customers.get(customer2).user_calculation(how,customers.get(customer2).tier,customers.get(customer2).money);

        user_information(customers.get(customer1));
        user_information(customers.get(customer2));

        if(customers.get(customer1).name.equals("이름6")){
            System.out.println("이미 존재하는 고객님 입니다.");
        }
        else{
            System.out.println("존재하지 않는 고객님 입니다.");
        }
    }


    public static void user_information(Customer c) {
        if(c.getHow().equals("할인 결제 방식")){
            System.out.println("===================");
            System.out.println("접속 경로: "+c.way);
            System.out.println("이름: "+c.name);
            System.out.println("등급: "+c.tier);
            System.out.println("결제 방식: "+c.how);
            System.out.println("결제 금액: "+c.money);
            System.out.println("===================");
        }
        else{
            System.out.println("===================");
            System.out.println("접속 경로: "+c.way);
            System.out.println("이름: "+c.name);
            System.out.println("등급: "+c.tier);
            System.out.println("결제 방식: "+c.how);
            System.out.println("보너스: "+c.bonus);
            System.out.println("결제 금액: "+c.money);
            System.out.println("===================");
        }

    }
}
enum User_Tier{
    BRONZE, SILVER, GOLD
}
