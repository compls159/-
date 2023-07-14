
abstract class Customer implements Sale {
        String way;
        String name;
        String tier;
        String how;
        int money;
        int bonus;
        Double sale;
        public Customer(String way, String name, String tier, String how, int money){
                this.way = way;
                this.name = name;
                this.tier = tier;
                this.how = how;
                this.bonus = -1;
                this.money = money;
        }
        public void setWay(String way){
                this.way = way;
        }
        public String getWay(){
                return this.way;
        }
        public void setName(String name){
                this.name = name;
        }
        public String getName(){
                return this.name;
        }
        public void setTier(String tier){
                this.tier=tier;
        }
        public void setHow(String how){
                this.how=how;
        }
        public String getHow(){
                return this.how;
        }
        public String getTier(){
                return this.tier;
        }
        public void setMoney(int money){
                this.money = money;
        }
        public int getMoney(){
                return money;
        }

        public static void user_information(Customer c) {

        }

        public void user_calculation(String how, String tier, int price) {
                if(how.equals("할인 결제 방식")){
                        this.money = user_sale(tier,price);
                }
                else{
                        user_bonus(tier,price);
                }

        }

        @Override
        public void user_bonus(String tier, int price) {
                switch(tier){
                        case "BRONZE":
                                this.bonus = (int)(price*0.1);
                                break;
                        case "SILVER":
                                this.bonus = (int)(price*0.2);
                                break;
                        case "GOLD":
                                this.bonus = (int)(price*0.3);
                                break;
                }

        }
        @Override
        public int user_sale(String tier, int price){
                switch(tier){
                        case "BRONZE":
                                price = (int) (price-(price*0.1));
                                break;
                        case "SILVER":
                                price = (int) (price-(price*0.2));
                                break;
                        case "GOLD":
                                price = (int) (price-(price*0.3));
                                break;

                }
                return price;
        }




        public boolean equals(String name){
                if(this.name == name)
                        return true;
                if(name == null || this.name != name)
                        return false;
                return false;
        }

}
