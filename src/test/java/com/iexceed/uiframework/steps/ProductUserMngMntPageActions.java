package com.iexceed.uiframework.steps;

import com.iexceed.uiframework.pageobjects.android.ProductUserMngMntPageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProductUserMngMntPageActions {

    public String platForm;
    ProductUserMngMntPageObjects productUserMngMntPageObjects = new ProductUserMngMntPageObjects();
    private static final Logger log = LogManager.getLogger(SourceofFundPageActions.class);


    public ProductUserMngMntPageActions(String platform) {
        this.platForm = platform;

    }

    public void selectproductScreen() throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.seletUserManageMnt();
        }
    }

    public void isProductScreen() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.isProductMngMntScreen();
        }
    }

    public void addProduct() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.clickAddNewProductBtn();
        }
    }

    public void chooseTradeFinance() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.clikTradeFinanceBtn();
        }
    }

    public void clickConfirmBtn() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.clikConfirmBtn();
        }
    }

    public void validateTradeFinanceDetails(String finance) throws Exception {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.validateTradeFinanceDetails(finance);
        }
    }

    public void clickDeleteBtn() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.clickDeleteBtn();
        }
    }

    public void isDeleteTradeMsgPresent() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.deleteTradeMsgValidation();
        }
    }
   public void clickCancelBtn() throws InterruptedException {
       if (platForm.equalsIgnoreCase("ios")) {
           log.debug("ios");
       } else {
           productUserMngMntPageObjects.clickCancelBtn();
       }
   }

   public void clickOkBtn() throws InterruptedException {
       if (platForm.equalsIgnoreCase("ios")) {
           log.debug("ios");
       } else {
           productUserMngMntPageObjects.clickOkBtn();
       }
   }
   public void enteraccName(String accname){
       if (platForm.equalsIgnoreCase("ios")) {
           log.debug("ios");
       } else {
           productUserMngMntPageObjects.enterAccntName(accname);
       }
   }

   public void clickOtherField(){
       if (platForm.equalsIgnoreCase("ios")) {
           log.debug("ios");
       } else {
           productUserMngMntPageObjects.clickOtherField();
       }
   }
   public void isAccNameErrorMsgPresent() throws InterruptedException {
       if (platForm.equalsIgnoreCase("ios")) {
           log.debug("ios");
       } else {
           productUserMngMntPageObjects.validateAccNumErrorMsg();
       }
   }

   public void selectPurposeOfAcount(String purpose){
       if (platForm.equalsIgnoreCase("ios")) {
           log.debug("ios");
       } else {
           productUserMngMntPageObjects.selectPurposeOfAccount(purpose);
       }
    }

    public void enterAdditionIntentFiled(String purpose){
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.enterAdditionalIntededField(purpose);
        }
    }
    public void isAddiionFieldErrorMsgPresent() throws InterruptedException {
        if (platForm.equalsIgnoreCase("ios")) {
            log.debug("ios");
        } else {
            productUserMngMntPageObjects.additionalFieldErrorMsgPresent();
        }
    }

}
