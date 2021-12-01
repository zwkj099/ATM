package atm;/*
 * @author HuWen
 * @date 2021/11/29/19:34
 * @version 1.0
 *加油每天坚持学习
 */

public class Account {
    private String carId;
    private String userName;
    private String passWord;
    private double money;
    private double qutamoney;

    public Account() {

    }

    public Account(String carId, String userName, String passWord, double money, double qutamoney) {
        this.carId = carId;
        this.userName = userName;
        this.passWord = passWord;
        this.money = money;
        this.qutamoney = qutamoney;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQutamoney() {
        return qutamoney;
    }

    public void setQutamoney(double qutamoney) {
        this.qutamoney = qutamoney;
    }
}
