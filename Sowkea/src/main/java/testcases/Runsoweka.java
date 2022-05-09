package testcases;

import org.testng.annotations.Test;

import base.BaseClass;

import pages.Search;

public class Runsoweka  extends BaseClass{
	@Test
public void runtestcases() throws InterruptedException

{
	Search s=new Search();
	s.search()
	.passInput()
	.selectProduct()
	.addProduct()
	.clickProduct()
	.pinCode().pinSelection().clickCartbutton().addedproducttoclick().refresh().carttoclick().continuee().firstname().lastname().email().telephone().sendotp().password().conifrmpassword().agree().paymentfirstname().paymentlastname().paymentcompany().paymentaddress1().paymentaddress2().paymentcity().shippingFirstname().shippinglastname().shippingcompay().shippingAddress1().shippingAddress2().shippingcity().paymentMode().confirmOrder();
	

	
}

	

	}


