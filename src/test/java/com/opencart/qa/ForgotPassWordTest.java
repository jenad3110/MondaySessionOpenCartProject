package com.opencart.qa;

import com.opencart.qa.base.CommonAPI;
import com.opencart.qa.pagesObjects.ForgotPassWordPage;
import org.testng.annotations.Test;



public class ForgotPassWordTest extends CommonAPI {



    @Test

    public void UserIsAbleToRestPassWord() throws InterruptedException {




        ForgotPassWordPage forgotPassWordPage = new ForgotPassWordPage((driver));
        forgotPassWordPage.ClickOnMyAccount();
        forgotPassWordPage.ClickOnLogin();
        Thread.sleep(10);

    }
}
