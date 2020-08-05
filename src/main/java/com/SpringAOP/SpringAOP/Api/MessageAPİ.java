package com.SpringAOP.SpringAOP.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringAOP.SpringAOP.Services.MessageService;


@RestController
@RequestMapping("/message")
public class MessageAPİ {
	
	@Autowired
	private MessageService messageservice;
	
	@PostMapping
	public ResponseEntity<String> ornekMethod( @RequestBody String mesaj)
	{
		return ResponseEntity.ok(messageservice.mesajVer(mesaj));
	}
	
	
}
