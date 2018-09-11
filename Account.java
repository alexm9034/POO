/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author Alumno
 */
public class Account {

    protected double balance;

    public Account(double initBalance) {
        balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        balance = balance + amount;
        return true;
    }

    public boolean withdraw(double amount) {
        balance = balance - amount;

        if (balance < amount) {
            return false;
        }
        else{
            return true;
        }
    }
}
