package com.scler.Splitwise.controller;

import com.scler.Splitwise.dto.SettleUpResponseDTO;
import com.scler.Splitwise.dto.TransactionDTO;
import com.scler.Splitwise.service.InitService;
import com.scler.Splitwise.service.InitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SettleUpController {

    @Autowired
    private InitService initService;


    @GetMapping("/init") // Get call to this url : localhost:8080/hello
    public ResponseEntity initialise()
    {
        initService.initialise();
        return ResponseEntity.ok("DONE");


    }
}
