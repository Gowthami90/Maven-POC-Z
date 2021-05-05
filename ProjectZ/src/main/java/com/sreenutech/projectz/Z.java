package com.sreenutech.projectz;

import com.sreenutech.projectz.model.ZReq;
import com.sreenutech.projectz.model.ZResp;

public class Z {
	public ZResp m3(ZReq zreq) {

		System.out.println("Entered into Z");

		// 1.get the request from C
		// 2.prepare the db request i.e db queries
		// 3.call database
		// 4.prepare the Zresp with the help of ResultSet

		ZResp zresp = new ZResp();

		zresp.setStatus("Delivered"); // replace with ResultSet

		System.out.println("Exit from Z");
		return zresp;

	}

}
