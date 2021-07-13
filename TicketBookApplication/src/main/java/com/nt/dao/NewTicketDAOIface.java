package com.nt.dao;

import com.nt.bo.NewTicketBO;

public interface NewTicketDAOIface {

	public String saveTicketDetails(NewTicketBO bo);
	public String displayTicketDetails(String str);
	public String cancelTicket(String str);
}
