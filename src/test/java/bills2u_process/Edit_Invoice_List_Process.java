package bills2u_process;

import config.PropertyClass;
import bills2u_constant.Obj_Rep_EditInvoiceBatch;
import bills2u_constant.Obj_Rep_InvoiceBatchList;
import bills2u_constant.Obj_Rep_Menu;
import bills2u_root.Root_Class_TestNG;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class Edit_Invoice_List_Process extends Root_Class_TestNG {

    public static void getTestData() throws IOException {
        PropertyClass rp=new PropertyClass();
        prop = rp.readPropertiesFile();
    }


    public static void EnterInvoiceNumber() throws IOException {
        try {
            Obj_Rep_EditInvoiceBatch eBList = new Obj_Rep_EditInvoiceBatch();
            PageFactory.initElements(driver, eBList);
            eBList.filterInvoiceNumber.sendKeys(prop.getProperty("Bills2U.EditBatchList.Invoice.Filter"));


        } catch (Exception e) {
            File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File(prop.getProperty("Bills2U.screenshot.Directory")+"/EnterInvoiceNumber.jpeg"));
            log.info(e.getMessage());
            test.fail(e.getMessage());
            test.info("Here, the screenshot has been attached.\n", MediaEntityBuilder.createScreenCaptureFromPath(prop.getProperty("Bills2U.screenshot.Directory")+"/EnterInvoiceNumber.jpeg").build());
        }

    }

    public static void FindFilterInvoiceBatch(String data) throws IOException {
        try {
            Obj_Rep_InvoiceBatchList bList = new Obj_Rep_InvoiceBatchList();
            PageFactory.initElements(driver, bList);
            bList.iptFindFilter.clear();
            bList.iptFindFilter.sendKeys(data);
            Thread.sleep(7000);

        } catch (Exception e) {
            File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File(prop.getProperty("Bills2U.screenshot.Directory")+"/FindFilterInvoiceBatch.jpeg"));
            log.info(e.getMessage());
            test.fail(e.getMessage());
            test.info("Here, the screenshot has been attached.\n", MediaEntityBuilder.createScreenCaptureFromPath(prop.getProperty("Bills2U.screenshot.Directory")+"/FindFilterInvoiceBatch.jpeg").build());
        }


    }

    public static void GoToEditInvoiceBatchList() throws IOException {
        try {
            Obj_Rep_InvoiceBatchList bList = new Obj_Rep_InvoiceBatchList();
            PageFactory.initElements(driver, bList);
            bList.goToEditInvoiceBatch.click();
            Thread.sleep(1000);
            if (bList.txtVerifyEditBatchInvoice.getText().contains(prop.getProperty("Bills2U.EditBatchList.BatchName.Filter"))) {
                test.pass("Biller be able to navigate to the \"Invoice batch edit\" page");
            } else {
                test.fail("Biller not be able to navigate to the \"Invoice batch edit\" page");
            }
        } catch (Exception e) {
            File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File(prop.getProperty("Bills2U.screenshot.Directory")+"/GoToEditInvoiceBatchList.jpeg"));
            log.info(e.getMessage());
            test.fail(e.getMessage());
            test.info("Here, the screenshot has been attached.\n", MediaEntityBuilder.createScreenCaptureFromPath(prop.getProperty("Bills2U.screenshot.Directory")+"/GoToEditInvoiceBatchList.jpeg").build());
        }


    }

    public static void GotToInVoiceBatch() throws IOException {
        try {
            Obj_Rep_Menu menu = new Obj_Rep_Menu();
            PageFactory.initElements(driver, menu);
            menu.menuInvoice.click();
            menu.menuInvoiceBatch.click();
            Thread.sleep(5000);
            Obj_Rep_InvoiceBatchList bList = new Obj_Rep_InvoiceBatchList();
            PageFactory.initElements(driver, bList);
            if (bList.txtInvoiceBatch.isDisplayed() && bList.txtInvoiceBatch.getText().equals("Invoice Batch")) {
                test.pass("Biller able to navigate to the \"Invoice batch\" page");
            } else {
                test.fail("err: Biller not able to navigate to the \"Invoice batch\" page");
            }
        } catch (Exception e) {
            File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File(prop.getProperty("Bills2U.screenshot.Directory")+"/GotToInVoiceBatch.jpeg"));
            log.info(e.getMessage());
            test.fail(e.getMessage());
            test.info("Here, the screenshot has been attached.\n", MediaEntityBuilder.createScreenCaptureFromPath(prop.getProperty("Bills2U.screenshot.Directory")+"/GotToInVoiceBatch.jpeg").build());
        }


    }

    public static void VerifyEnteredInvoiceNumber() throws IOException {
        try {
            EnterInvoiceNumber();
            Obj_Rep_EditInvoiceBatch eBList = new Obj_Rep_EditInvoiceBatch();
            PageFactory.initElements(driver, eBList);
            if (eBList.filterInvoiceNumber.getAttribute("value").contains(prop.getProperty("Bills2U.EditBatchList.Invoice.Filter"))) {
                test.pass("Biller be able to enter the invoice number in filter");
            } else {
                test.fail("Biller not be able to enter the invoice number in filter");
            }
        } catch (Exception e) {
            File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File(prop.getProperty("Bills2U.screenshot.Directory")+"/VerifyEnteredInvoiceNumber.jpeg"));
            log.info(e.getMessage());
            test.fail(e.getMessage());
            test.info("Here, the screenshot has been attached.\n", MediaEntityBuilder.createScreenCaptureFromPath(prop.getProperty("Bills2U.screenshot.Directory")+"/VerifyEnteredInvoiceNumber.jpeg").build());
        }

    }

    public static void EnterRef1Number() throws IOException {
        try {
            Obj_Rep_EditInvoiceBatch eBList = new Obj_Rep_EditInvoiceBatch();
            PageFactory.initElements(driver, eBList);
            eBList.filterRef1.sendKeys(prop.getProperty("Bills2U.EditBatchList.Ref1.Filter"));
        } catch (Exception e) {
            File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File(prop.getProperty("Bills2U.screenshot.Directory")+"/EnterRef1Number.jpeg"));
            log.info(e.getMessage());
            test.fail(e.getMessage());
            test.info("Here, the screenshot has been attached.\n", MediaEntityBuilder.createScreenCaptureFromPath(prop.getProperty("Bills2U.screenshot.Directory")+"/EnterRef1Number.jpeg").build());
        }



    }

    public static void VerifyEnteredRef1Number() throws IOException {
        try {
            EnterRef1Number();
            Obj_Rep_EditInvoiceBatch eBList = new Obj_Rep_EditInvoiceBatch();
            PageFactory.initElements(driver, eBList);
            if (eBList.filterRef1.getAttribute("value").contains(prop.getProperty("Bills2U.EditBatchList.Ref1.Filter"))) {
                test.pass("Biller be able to enter the reference1 in filter");
            } else {
                test.fail("Biller not be able to enter the reference1 in filter");
            }
        } catch (Exception e) {
            File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File(prop.getProperty("Bills2U.screenshot.Directory")+"/VerifyEnteredRef1Number.jpeg"));
            log.info(e.getMessage());
            test.fail(e.getMessage());
            test.info("Here, the screenshot has been attached.\n", MediaEntityBuilder.createScreenCaptureFromPath(prop.getProperty("Bills2U.screenshot.Directory")+"/VerifyEnteredRef1Number.jpeg").build());
        }

    }

    public static void EnterRef2Number() throws IOException {
        try {
            Obj_Rep_EditInvoiceBatch eBList = new Obj_Rep_EditInvoiceBatch();
            PageFactory.initElements(driver, eBList);
            eBList.filterRef2.sendKeys(prop.getProperty("Bills2U.EditBatchList.Ref2.Filter"));
        } catch (Exception e) {
            File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File(prop.getProperty("Bills2U.screenshot.Directory")+"/EnterRef2Number.jpeg"));
            log.info(e.getMessage());
            test.fail(e.getMessage());
            test.info("Here, the screenshot has been attached.\n", MediaEntityBuilder.createScreenCaptureFromPath(prop.getProperty("Bills2U.screenshot.Directory")+"/EnterRef2Number.jpeg").build());
        }



    }

    public static void VerifyEnteredRef2Number() throws IOException {
        try {
            EnterRef2Number();
            Obj_Rep_EditInvoiceBatch eBList = new Obj_Rep_EditInvoiceBatch();
            PageFactory.initElements(driver, eBList);
            if (eBList.filterRef2.getAttribute("value").contains(prop.getProperty("Bills2U.EditBatchList.Ref2.Filter"))) {
                test.pass("Biller be able to enter the reference2 in filter");
            } else {
                test.fail("Biller not be able to enter the reference2 in filter");
            }
        } catch (Exception e) {
            File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File(prop.getProperty("Bills2U.screenshot.Directory")+"/VerifyEnteredRef2Number.jpeg"));
            log.info(e.getMessage());
            test.fail(e.getMessage());
            test.info("Here, the screenshot has been attached.\n", MediaEntityBuilder.createScreenCaptureFromPath(prop.getProperty("Bills2U.screenshot.Directory")+"/VerifyEnteredRef2Number.jpeg").build());
        }

    }

    public static void ClickSearchBtnInvoiceNumber() throws IOException {
        try {
            Obj_Rep_EditInvoiceBatch eBList = new Obj_Rep_EditInvoiceBatch();
            PageFactory.initElements(driver, eBList);
            eBList.btnSearchInBatchInvoices.click();
            Thread.sleep(7000);

            if (eBList.rowVerifyInvoiceNumber.getText().contains(prop.getProperty("Bills2U.EditBatchList.Invoice.Filter"))) {
                test.pass("Biller be able to view the filtered invoice list by invoice number");
            } else {
                test.fail("Biller not be able to view the filtered invoice list by invoice number");
            }
        } catch (Exception e) {
            File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File(prop.getProperty("Bills2U.screenshot.Directory")+"/ClickSearchBtnInvoiceNumber.jpeg"));
            log.info(e.getMessage());
            test.fail(e.getMessage());
            test.info("Here, the screenshot has been attached.\n", MediaEntityBuilder.createScreenCaptureFromPath(prop.getProperty("Bills2U.screenshot.Directory")+"/ClickSearchBtnInvoiceNumber.jpeg").build());
        }



    }

    public static void ClickSearchBtnRef1() throws IOException {
        try {
            Obj_Rep_EditInvoiceBatch eBList = new Obj_Rep_EditInvoiceBatch();
            PageFactory.initElements(driver, eBList);
            eBList.btnSearchInBatchInvoices.click();
            Thread.sleep(7000);

            if (eBList.rowVerifyRef1.getText().contains(prop.getProperty("Bills2U.EditBatchList.Ref1.Filter"))) {
                test.pass("Biller be able to view the filtered invoice list by reference 1");
            } else {
                test.fail("Biller not be able to view the filtered invoice list by reference 1");
            }
        } catch (Exception e) {
            File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File(prop.getProperty("Bills2U.screenshot.Directory")+"/ClickSearchBtnRef1.jpeg"));
            log.info(e.getMessage());
            test.fail(e.getMessage());
            test.info("Here, the screenshot has been attached.\n", MediaEntityBuilder.createScreenCaptureFromPath(prop.getProperty("Bills2U.screenshot.Directory")+"/ClickSearchBtnRef1.jpeg").build());
        }



    }

    public static void ClickSearchBtnRef2() throws IOException {
        try {
            Obj_Rep_EditInvoiceBatch eBList = new Obj_Rep_EditInvoiceBatch();
            PageFactory.initElements(driver, eBList);
            eBList.btnSearchInBatchInvoices.click();
            Thread.sleep(7000);

            if (eBList.rowVerifyRef2.getText().contains(prop.getProperty("Bills2U.EditBatchList.Ref2.Filter"))) {
                test.pass("Biller be able to view the filtered invoice list by reference 2");
            } else {
                test.fail("Biller not be able to view the filtered invoice list by reference 2");
            }
        } catch (Exception e) {
            File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File(prop.getProperty("Bills2U.screenshot.Directory")+"/ClickSearchBtnRef2.jpeg"));
            log.info(e.getMessage());
            test.fail(e.getMessage());
            test.info("Here, the screenshot has been attached.\n", MediaEntityBuilder.createScreenCaptureFromPath(prop.getProperty("Bills2U.screenshot.Directory")+"/ClickSearchBtnRef2.jpeg").build());
        }



    }

    public static void ClickSearchBtnInvoiceBatchList() throws IOException {
        try {
            Obj_Rep_EditInvoiceBatch eBList = new Obj_Rep_EditInvoiceBatch();
            PageFactory.initElements(driver, eBList);
            eBList.btnSearchInBatchInvoices.click();
            Thread.sleep(7000);

            if (eBList.rowVerifyInvoiceNumber.getText().contains(prop.getProperty("Bills2U.EditBatchList.Invoice.Filter"))
                    && eBList.rowVerifyRef1.getText().contains(prop.getProperty("Bills2U.EditBatchList.Ref1.Filter"))
                    && eBList.rowVerifyRef2.getText().contains(prop.getProperty("Bills2U.EditBatchList.Ref2.Filter"))) {
                test.pass("Biller be able to view the filtered invoice list by invoice no, Ref1 and Ref2");
            } else {
                test.fail("Biller not be able to view the filtered invoice list by invoice no, Ref1 and Ref2");
            }
        } catch (Exception e) {
            File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File(prop.getProperty("Bills2U.screenshot.Directory")+"/ClickSearchBtnInvoiceBatchList.jpeg"));
            log.info(e.getMessage());
            test.fail(e.getMessage());
            test.info("Here, the screenshot has been attached.\n", MediaEntityBuilder.createScreenCaptureFromPath(prop.getProperty("Bills2U.screenshot.Directory")+"/ClickSearchBtnInvoiceBatchList.jpeg").build());
        }
    }
}
