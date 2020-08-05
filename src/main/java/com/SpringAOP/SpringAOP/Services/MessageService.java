package com.SpringAOP.SpringAOP.Services;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	
	
	public String mesajVer(String str)
	{
		System.out.println("metod mesaj verdi : "+str);
		return str;
	}
	
	
}
