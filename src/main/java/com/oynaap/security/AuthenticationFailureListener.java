package com.oynaap.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class AuthenticationFailureListener implements ApplicationListener<AuthenticationFailureBadCredentialsEvent> {
    @SuppressWarnings("unused")
	@Autowired
    private HttpServletRequest request;

    @Override
    public void onApplicationEvent(final AuthenticationFailureBadCredentialsEvent e) {
      
       
    }

}