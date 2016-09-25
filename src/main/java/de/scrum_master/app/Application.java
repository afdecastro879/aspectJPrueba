package de.scrum_master.app;

import com.example.AccountBean;

public class Application {
    public static void main(String[] args) {
        AccountBean accountBean = new AccountBean();
        accountBean.setName("Test");
        accountBean.setAmount(12.34F);
        System.out.println(accountBean);
    }
}
