package com.project.apidbtester.controller;

import com.project.apidbtester.error.ClientDBConnectionException;
import com.project.apidbtester.model.ClientDBDetails;
import com.project.apidbtester.model.CustomApiResponseBody;
import com.project.apidbtester.service.ClientDBDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;


@RestController
public class ClientDBDetailsController {
    @Autowired
    private ClientDBDetailsService clientDBDetailsService;
    @PostMapping("/test-client-db-connection")
    public CustomApiResponseBody testClientDBConnection(@RequestBody ClientDBDetails clientDBDetails) throws ClientDBConnectionException {
        return clientDBDetailsService.testClientDBConnection(clientDBDetails);
    }
}
